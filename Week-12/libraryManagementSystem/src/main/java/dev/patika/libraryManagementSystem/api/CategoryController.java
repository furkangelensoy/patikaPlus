package dev.patika.libraryManagementSystem.api;

import dev.patika.libraryManagementSystem.business.abstracts.CategoryService;
import dev.patika.libraryManagementSystem.core.config.modelMapper.ModelMapperService;
import dev.patika.libraryManagementSystem.core.result.Result;
import dev.patika.libraryManagementSystem.core.result.ResultData;
import dev.patika.libraryManagementSystem.core.utils.ResultHelper;
import dev.patika.libraryManagementSystem.dto.request.category.CategorySaveRequest;
import dev.patika.libraryManagementSystem.dto.request.category.CategoryUpdateRequest;
import dev.patika.libraryManagementSystem.dto.response.CursorResponse;
import dev.patika.libraryManagementSystem.dto.response.category.CategoryResponse;
import dev.patika.libraryManagementSystem.entity.Category;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryServices;
    private final ModelMapperService mapperService;

    @GetMapping("{id}")
    public ResultData<CategoryResponse> get(@PathVariable long id) {
        CategoryResponse response = mapperService.forResponse().map(categoryServices.get(id), CategoryResponse.class);
        return ResultHelper.OK(response);
    }

    @PostMapping
    public ResultData<CategoryResponse> save(@Valid @RequestBody CategorySaveRequest saveRequest) {
        CategoryResponse response = mapperService.forResponse().map(categoryServices.save(mapperService.forRequest().map(saveRequest, Category.class)), CategoryResponse.class);
        return ResultHelper.CREATED(response);
    }

    @PutMapping
    public ResultData<CategoryResponse> update(@Valid @RequestBody CategoryUpdateRequest updateRequest) {
        CategoryResponse response = mapperService.forResponse()
                .map(categoryServices.update(mapperService.forRequest()
                        .map(updateRequest, Category.class)), CategoryResponse.class);

        return ResultHelper.CREATED(response);
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable long id) {
        return ResultHelper.OK(categoryServices.delete(id));
    }

    @GetMapping
    public ResultData<CursorResponse<CategoryResponse>> cursor(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {

        Page<Category> pages = categoryServices.cursor(page, pageSize);

        Page<CategoryResponse> responses = pages.map(category -> mapperService.forResponse().map(category, CategoryResponse.class));

        return ResultHelper.cursor(responses);
    }
}
