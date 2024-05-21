package dev.patika.libraryManagementSystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "book_borrowings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowing_id", columnDefinition = "serial")
    private long id;

    @Column(name = "borrow_name", nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrow_date", nullable = false)
    private LocalDate date;

    @Column(name = "borrow_mail")
    @Email
    private String mail;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrow_return_date")
    private LocalDate returnDate;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "borrow_book_id", referencedColumnName = "book_id")
    private Book book;
}
