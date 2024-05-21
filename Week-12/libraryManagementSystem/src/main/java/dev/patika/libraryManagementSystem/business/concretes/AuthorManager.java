package dev.patika.libraryManagementSystem.business.concretes;

import dev.patika.libraryManagementSystem.business.abstracts.AuthorService;
import dev.patika.libraryManagementSystem.core.exception.NotFoundException;
import dev.patika.libraryManagementSystem.core.utils.Message;
import dev.patika.libraryManagementSystem.dao.AuthorRepository;
import dev.patika.libraryManagementSystem.entity.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorManager implements AuthorService {
    private final AuthorRepository authorRepository;
    @Override
    public Author get(long id) {
        return authorRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND));
    }

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author update(Author author) {
        this.get(author.getId());
        return authorRepository.save(author);
    }

    @Override
    public Page<Author> cursor(int page, int pageSize) {
        return authorRepository.findAll(PageRequest.of(page,pageSize));
    }

    @Override
    public boolean delete(long id) {
        authorRepository.delete(this.get(id));
        return true;
    }
}
