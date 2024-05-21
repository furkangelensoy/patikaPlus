package dev.patika.libraryManagementSystem.api;

import dev.patika.libraryManagementSystem.business.abstracts.PublisherService;
import dev.patika.libraryManagementSystem.core.config.modelMapper.ModelMapperService;
import dev.patika.libraryManagementSystem.core.result.Result;
import dev.patika.libraryManagementSystem.core.result.ResultData;
import dev.patika.libraryManagementSystem.core.utils.ResultHelper;
import dev.patika.libraryManagementSystem.dto.request.publisher.PublisherSaveRequest;
import dev.patika.libraryManagementSystem.dto.request.publisher.PublisherUpdateRequest;
import dev.patika.libraryManagementSystem.dto.response.CursorResponse;
import dev.patika.libraryManagementSystem.dto.response.publisher.PublisherResponse;
import dev.patika.libraryManagementSystem.entity.Publisher;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/publishers")
@RequiredArgsConstructor
public class PublisherController {
    private final PublisherService publisherServices;
    private final ModelMapperService mapperService;

    @GetMapping("{id}")
    public ResultData<PublisherResponse> getId(@PathVariable long id){
        PublisherResponse publisherResponse = mapperService.forResponse().map(publisherServices.get(id),PublisherResponse.class);
        return ResultHelper.OK(publisherResponse);
    }
    @PostMapping
    public ResultData<PublisherResponse> save(@Valid @RequestBody PublisherSaveRequest publisherSaveRequest){
        PublisherResponse publisherResponse = mapperService.forResponse().map(publisherServices.save(mapperService.forRequest().map(publisherSaveRequest, Publisher.class)),PublisherResponse.class);
        return ResultHelper.CREATED(publisherResponse);
    }
    @PutMapping
    public ResultData<PublisherResponse> update(@Valid @RequestBody PublisherUpdateRequest publisherUpdateRequest){
        PublisherResponse publisherResponse = mapperService.forResponse().map(publisherServices.update(mapperService.forRequest().map(publisherUpdateRequest, Publisher.class)),PublisherResponse.class);
        return ResultHelper.CREATED(publisherResponse);
    }
    @DeleteMapping("{id}")
    public Result delete(@PathVariable long id){
        return ResultHelper.OK(publisherServices.delete(id));
    }
    @GetMapping
    public ResultData<CursorResponse<PublisherResponse>> cursor(@RequestParam(name = "page", required = false, defaultValue = "0") int page, @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        Page<Publisher> publishers = publisherServices.cursor(page,pageSize);
        Page<PublisherResponse> publisherResponses = publishers.map(publisher -> mapperService.forResponse().map(publisher,PublisherResponse.class));
        return ResultHelper.cursor(publisherResponses);
    }
}
