package dev.patika.libraryManagementSystem.business.concretes;

import dev.patika.libraryManagementSystem.business.abstracts.BookBorrowingService;
import dev.patika.libraryManagementSystem.core.exception.NotFoundException;
import dev.patika.libraryManagementSystem.core.utils.Message;
import dev.patika.libraryManagementSystem.dao.BookBorrowingRepository;
import dev.patika.libraryManagementSystem.entity.BookBorrowing;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookBorrowingManager implements BookBorrowingService {
    private final BookBorrowingRepository bookBorrowingRepository;
    @Override
    public BookBorrowing get(long id) {
        return this.bookBorrowingRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND));
    }

    @Override
    public BookBorrowing save(BookBorrowing bookBorrowing) {
        return this.bookBorrowingRepository.save(bookBorrowing);
    }

    @Override
    public BookBorrowing update(BookBorrowing bookBorrowing) {
        this.get(bookBorrowing.getId());
        return this.bookBorrowingRepository.save(bookBorrowing);
    }

    @Override
    public Page<BookBorrowing> cursor(int page, int pageSize) {
        return this.bookBorrowingRepository.findAll(PageRequest.of(page,pageSize));
    }

    @Override
    public boolean delete(long id) {
        this.bookBorrowingRepository.delete(this.get(id));
        return true;
    }
}
