package dev.patika.libraryManagementSystem.business.abstracts;

import dev.patika.libraryManagementSystem.entity.Publisher;
import org.springframework.data.domain.Page;

public interface PublisherService {
    Publisher get(long id);
    Publisher save(Publisher publisher);
    Publisher update(Publisher publisher);
    Page<Publisher> cursor(int page, int pageSize);
    boolean delete(long id);
}
