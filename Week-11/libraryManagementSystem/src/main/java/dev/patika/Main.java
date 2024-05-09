package dev.patika;

import dev.patika.Entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        /*

        Author author = new Author();
        author.setName("kodluyoruz");
        author.setBirthYear(1900);
        author.setCountry("Turkiye");

        Publisher publisher = new Publisher();
        publisher.setName("Dev.Patika");
        publisher.setEstablishmentYear(1950);
        publisher.setAddress("Istanbul");

        Category category = new Category();
        category.setName("science fiction");
        category.setDescription("science fiction");

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category);

        Book book = new Book();
        book.setAuthor(author);
        book.setName("Patika");
        book.setPublisher(publisher);
        book.setCategoryList(categoryList);
        book.setPublicationYear(2012);
        book.setStock(5);
        entityManager.persist(book);

        */

        /*

        Author author = entityManager.find(Author.class, 1);

        Publisher publisher = entityManager.find(Publisher.class, 1);

        Category category = new Category();
        category.setName("biography");
        category.setDescription("biography");

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category);

        Book book = new Book();
        book.setAuthor(author);
        book.setName("Patika 2");
        book.setPublisher(publisher);
        book.setCategoryList(categoryList);
        book.setPublicationYear(2013);
        book.setStock(7);

        entityManager.persist(book);

        */

        /*

        Book book = entityManager.find(Book.class , 1);

        Category category = new Category();
        category.setName("fantastic");
        category.setDescription("fantastic");

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category);
        categoryList.add(entityManager.find(Category.class,1));

        book.setCategoryList(categoryList);

        entityManager.persist(book);

        System.out.println(book.toString());

        */



        /*

        BookBorrowing bookBorrowing = new BookBorrowing();
        bookBorrowing.setName("test");
        bookBorrowing.setBorrowingDate(LocalDate.now());
        bookBorrowing.setReturnDate(LocalDate.now());
        bookBorrowing.setBook(entityManager.find(Book.class,1));

        entityManager.persist(bookBorrowing);

        */

        Book book = entityManager.find(Book.class,1);
        System.out.println(book.toString());

        transaction.commit();
    }
}