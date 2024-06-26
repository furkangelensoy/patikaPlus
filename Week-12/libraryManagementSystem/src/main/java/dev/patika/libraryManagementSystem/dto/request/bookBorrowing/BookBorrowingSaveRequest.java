package dev.patika.libraryManagementSystem.dto.request.bookBorrowing;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingSaveRequest {
    private String name;

    @Email
    private String mail;
}
