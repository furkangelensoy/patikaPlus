package dev.patika.libraryManagementSystem.business.concretes;

import dev.patika.libraryManagementSystem.business.abstracts.PublisherService;
import dev.patika.libraryManagementSystem.core.exception.NotFoundException;
import dev.patika.libraryManagementSystem.core.utils.Message;
import dev.patika.libraryManagementSystem.dao.PublisherRepository;
import dev.patika.libraryManagementSystem.entity.Publisher;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PublisherManager implements PublisherService {
    private final PublisherRepository publisherRepository;

    @Override
    public Publisher get(long id) {
        return this.publisherRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND));
    }

    @Override
    public Publisher save(Publisher publisher) {
        return this.publisherRepository.save(publisher);
    }

    @Override
    public Publisher update(Publisher publisher) {
        this.get(publisher.getId());
        return this.publisherRepository.save(publisher);
    }

    @Override
    public Page<Publisher> cursor(int page, int pageSize) {
        return this.publisherRepository.findAll(PageRequest.of(page,pageSize));
    }

    @Override
    public boolean delete(long id) {
        this.publisherRepository.delete(this.get(id));
        return true;
    }
}
