package dev.patika.libraryManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", columnDefinition = "serial")
    private long id;

    @Column(name = "book_name", nullable = false)
    private String name;

    @Column(name = "book_year", nullable = false)
    private int year;

    @Column(name = "book_stock", nullable = false)
    private int stock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_publisher_id" , referencedColumnName = "publisher_id")
    private Publisher publisher;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "book_author_id", referencedColumnName = "author_id")
    private Author author;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "book2categories",
            joinColumns = {@JoinColumn(name = "book2categories_book_id")},
            inverseJoinColumns = {@JoinColumn(name = "book2categories_category_id")}
    )
    private List<Category> categoryList;

    @OneToMany(mappedBy = "book")
    private List<BookBorrowing> bookBorrowingList;
}
