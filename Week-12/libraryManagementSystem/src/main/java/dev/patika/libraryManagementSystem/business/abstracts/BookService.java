package dev.patika.libraryManagementSystem.business.abstracts;

import dev.patika.libraryManagementSystem.entity.Book;
import org.springframework.data.domain.Page;

public interface BookService {
    Book get(long id);
    Book save(Book book);
    Book update(Book book);
    Page<Book> cursor(int page, int pageSize);
    boolean delete(long id);
}
