package dev.patika.libraryManagementSystem.business.concretes;


import dev.patika.libraryManagementSystem.business.abstracts.CategoryService;
import dev.patika.libraryManagementSystem.core.exception.NotFoundException;
import dev.patika.libraryManagementSystem.core.utils.Message;
import dev.patika.libraryManagementSystem.dao.CategoryRepository;
import dev.patika.libraryManagementSystem.entity.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryManager implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category get(long id) {
        return this.categoryRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND));
    }

    @Override
    public Category save(Category category) {
        return this.categoryRepository.save(category);
    }

    @Override
    public Category update(Category category) {
        this.get(category.getId());
        return this.categoryRepository.save(category);
    }

    @Override
    public Page<Category> cursor(int page, int pageSize) {
        return this.categoryRepository.findAll(PageRequest.of(page,pageSize));
    }

    @Override
    public boolean delete(long id) {
        this.categoryRepository.delete(this.get(id));
        return true;
    }
}
