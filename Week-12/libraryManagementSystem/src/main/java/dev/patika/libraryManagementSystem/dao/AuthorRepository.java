package dev.patika.libraryManagementSystem.dao;

import dev.patika.libraryManagementSystem.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    Optional<Author> findByNameAndCountry(String name, String country);
}
