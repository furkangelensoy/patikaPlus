package dev.patika.libraryManagementSystem.dto.request.author;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorSaveRequest {

    @NotBlank
    @NotEmpty
    private String name;

    @NotNull
    private LocalDate year;

    @NotBlank
    @NotEmpty
    private String country;
}
