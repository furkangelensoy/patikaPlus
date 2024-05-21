package dev.patika.libraryManagementSystem.dto.request.book;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookSaveRequest {
    private String name;
    private int year;
    private int stock;
    private int authorId;
    private int publisherId;
}
