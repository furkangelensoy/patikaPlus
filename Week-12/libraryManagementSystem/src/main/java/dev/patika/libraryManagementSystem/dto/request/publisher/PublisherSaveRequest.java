package dev.patika.libraryManagementSystem.dto.request.publisher;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherSaveRequest {

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    private LocalDate establishmentYear;

    @NotNull
    @NotEmpty
    private String address;

}
