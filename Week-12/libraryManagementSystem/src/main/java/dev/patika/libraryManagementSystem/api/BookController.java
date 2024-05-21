package dev.patika.libraryManagementSystem.api;

import dev.patika.libraryManagementSystem.business.abstracts.AuthorService;
import dev.patika.libraryManagementSystem.business.abstracts.BookService;
import dev.patika.libraryManagementSystem.business.abstracts.PublisherService;
import dev.patika.libraryManagementSystem.core.config.modelMapper.ModelMapperService;
import dev.patika.libraryManagementSystem.core.result.Result;
import dev.patika.libraryManagementSystem.core.result.ResultData;
import dev.patika.libraryManagementSystem.core.utils.ResultHelper;
import dev.patika.libraryManagementSystem.dto.request.book.BookSaveRequest;
import dev.patika.libraryManagementSystem.dto.request.book.BookUpdateRequest;
import dev.patika.libraryManagementSystem.dto.response.CursorResponse;
import dev.patika.libraryManagementSystem.dto.response.book.BookResponse;
import dev.patika.libraryManagementSystem.entity.Author;
import dev.patika.libraryManagementSystem.entity.Book;
import dev.patika.libraryManagementSystem.entity.Publisher;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/books")
@RequiredArgsConstructor
public class BookController {
    private final ModelMapperService mapperService;
    private final BookService bookServices;
    private final AuthorService authorService;
    private final PublisherService publisherService;

    @GetMapping("{id}")
    public ResultData<BookResponse> get(@PathVariable long id){
        BookResponse bookResponse = mapperService.forResponse().map(bookServices.get(id),BookResponse.class);
        return ResultHelper.OK(bookResponse);
    }
    @PostMapping
    public ResultData<BookResponse> save(@Valid @RequestBody BookSaveRequest bookSaveRequest){

        Book saveBook =this.mapperService.forRequest().map(bookSaveRequest, Book.class);

        Author author = this.authorService.get(bookSaveRequest.getAuthorId());
        saveBook.setAuthor(author);

        Publisher publisher = this.publisherService.get(bookSaveRequest.getPublisherId());
        saveBook.setPublisher(publisher);

        this.bookServices.save(saveBook);

        return ResultHelper.CREATED(this.mapperService.forResponse().map(saveBook, BookResponse.class));
    }
    @PutMapping
    public ResultData<BookResponse> update(@Valid @RequestBody BookUpdateRequest bookUpdateRequest){

        Book book = this.bookServices.get(bookUpdateRequest.getId());

        book.setName(bookUpdateRequest.getName());
        book.setStock(bookUpdateRequest.getStock());
        book.setYear(bookUpdateRequest.getYear());

        Book updateBook = this.bookServices.update(book);

        return ResultHelper.OK(this.mapperService.forResponse().map(updateBook, BookResponse.class));
    }
    @DeleteMapping("{id}")
    public Result delete(@PathVariable long id){
        return ResultHelper.OK(bookServices.delete(id));
    }
    @GetMapping
    public ResultData<CursorResponse<BookResponse>> cursor(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        Page<Book> books = bookServices.cursor(page, pageSize);
        Page<BookResponse> bookResponses = books.map(book -> mapperService.forResponse().map(book, BookResponse.class));
        return ResultHelper.cursor(bookResponses);
    }
}
