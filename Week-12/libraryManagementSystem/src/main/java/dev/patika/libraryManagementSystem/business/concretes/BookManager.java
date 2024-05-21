package dev.patika.libraryManagementSystem.business.concretes;

import dev.patika.libraryManagementSystem.business.abstracts.BookService;
import dev.patika.libraryManagementSystem.core.exception.NotFoundException;
import dev.patika.libraryManagementSystem.core.utils.Message;
import dev.patika.libraryManagementSystem.dao.AuthorRepository;
import dev.patika.libraryManagementSystem.dao.BookRepository;
import dev.patika.libraryManagementSystem.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookManager implements BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Override
    public Book get(long id) {
        return this.bookRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND));
    }

    @Override
    public Book save(Book book) {
        book.setAuthor(this.authorRepository.findById(book.getAuthor().getId()).orElseThrow());
        return this.bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        this.get(book.getId());
        return this.bookRepository.save(book);
    }

    @Override
    public Page<Book> cursor(int page, int pageSize) {
        return this.bookRepository.findAll(PageRequest.of(page,pageSize));
    }

    @Override
    public boolean delete(long id) {
        this.bookRepository.delete(this.get(id));
        return true;
    }
}
