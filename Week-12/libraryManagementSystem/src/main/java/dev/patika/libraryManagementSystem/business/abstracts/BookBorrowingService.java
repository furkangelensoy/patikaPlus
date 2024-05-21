package dev.patika.libraryManagementSystem.business.abstracts;

import dev.patika.libraryManagementSystem.entity.BookBorrowing;
import org.springframework.data.domain.Page;

public interface BookBorrowingService {
    BookBorrowing get(long id);
    BookBorrowing save(BookBorrowing bookBorrowing);
    BookBorrowing update(BookBorrowing bookBorrowing);
    Page<BookBorrowing> cursor(int page, int pageSize);
    boolean delete(long id);
}
