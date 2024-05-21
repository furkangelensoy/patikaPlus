package dev.patika.libraryManagementSystem.business.abstracts;

import dev.patika.libraryManagementSystem.entity.Author;
import org.springframework.data.domain.Page;

public interface AuthorService {
    Author get(long id);
    Author save(Author author);
    Author update(Author author);
    Page<Author> cursor(int page, int pageSize);
    boolean delete(long id);
}
