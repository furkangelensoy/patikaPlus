package dev.patika.libraryManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", columnDefinition = "serial")
    private long id;

    @Column(name = "category_name" , nullable = false , unique = true)
    private String name;

    @Column(name = "category_description" , nullable = false)
    private String description;

    //Mappedby field ismi ile yazılır.
    @ManyToMany(mappedBy = "categoryList" , cascade = CascadeType.REMOVE)
    private List<Book> bookList;


}
