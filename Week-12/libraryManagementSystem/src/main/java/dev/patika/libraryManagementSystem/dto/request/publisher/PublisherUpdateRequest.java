package dev.patika.libraryManagementSystem.dto.request.publisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherUpdateRequest {
    private long id;
    private String name;
    private LocalDate establishmentYear;
    private String address;
}
