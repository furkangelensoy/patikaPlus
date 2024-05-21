package dev.patika.libraryManagementSystem.business.abstracts;

import dev.patika.libraryManagementSystem.entity.Category;
import org.springframework.data.domain.Page;

public interface CategoryService {
    Category get(long id);
    Category save(Category category);
    Category update(Category category);
    Page<Category> cursor(int page, int pageSize);
    boolean delete(long id);
}
