package dev.patika.libraryManagementSystem.api;

import dev.patika.libraryManagementSystem.business.abstracts.AuthorService;
import dev.patika.libraryManagementSystem.core.config.modelMapper.ModelMapperService;
import dev.patika.libraryManagementSystem.core.exception.NotFoundException;
import dev.patika.libraryManagementSystem.core.result.Result;
import dev.patika.libraryManagementSystem.core.result.ResultData;
import dev.patika.libraryManagementSystem.core.utils.Message;
import dev.patika.libraryManagementSystem.core.utils.ResultHelper;
import dev.patika.libraryManagementSystem.dao.AuthorRepository;
import dev.patika.libraryManagementSystem.dto.request.author.AuthorSaveRequest;
import dev.patika.libraryManagementSystem.dto.request.author.AuthorUpdateRequest;
import dev.patika.libraryManagementSystem.dto.response.CursorResponse;
import dev.patika.libraryManagementSystem.dto.response.author.AuthorResponse;
import dev.patika.libraryManagementSystem.entity.Author;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;
    private final ModelMapperService mapperService;
    private final AuthorRepository authorRepository;

    @GetMapping("/{id}")
    public ResultData<AuthorResponse> get(@PathVariable long id) {

        AuthorResponse authorResponse = mapperService.forResponse().
                map(authorService.get(id), AuthorResponse.class);


        return ResultHelper.OK(authorResponse);
    }

    @PostMapping
    public ResultData<AuthorResponse> save(@Valid @RequestBody AuthorSaveRequest authorSaveRequest) {

        AuthorResponse authorResponse = mapperService.forResponse()
                .map(authorService.save(mapperService.forRequest().map(authorSaveRequest, Author.class))
                        , AuthorResponse.class);

        return ResultHelper.CREATED(authorResponse);
    }

    @PutMapping
    public ResultData<AuthorResponse> update(@Valid @RequestBody AuthorUpdateRequest authorUpdateRequest) {

        AuthorResponse authorResponse = mapperService.forResponse()
                .map(authorService.update(mapperService.forRequest().map(authorUpdateRequest, Author.class)),
                        AuthorResponse.class);

        return ResultHelper.OK(authorResponse);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable long id) {
        return ResultHelper.OK(authorService.delete(id));
    }

    @GetMapping
    public ResultData<CursorResponse<AuthorResponse>> cursor(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "pagesize", required = false, defaultValue = "10") int pageSize) {

        Page<Author> authorPage = authorService.cursor(page, pageSize);
        Page<AuthorResponse> authorResponsePage = authorPage.map(author -> mapperService.forResponse()
                .map(author, AuthorResponse.class));

        return ResultHelper.cursor(authorResponsePage);
    }


    @GetMapping("/get-by-name")
    public ResultData<AuthorResponse> getByNameAndCountry(@RequestParam String name, @RequestParam String country) {
        Author author = authorRepository.findByNameAndCountry(name,country).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND));

        AuthorResponse authorResponse = mapperService.forResponse().map(author, AuthorResponse.class);

        return ResultHelper.OK(authorResponse);
    }
}
