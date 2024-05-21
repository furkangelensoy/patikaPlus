package dev.patika.libraryManagementSystem.dao;

import dev.patika.libraryManagementSystem.entity.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookBorrowingRepository extends JpaRepository<BookBorrowing, Long> {
}
