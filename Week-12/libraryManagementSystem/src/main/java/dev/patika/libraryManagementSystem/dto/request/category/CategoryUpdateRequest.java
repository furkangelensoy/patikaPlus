package dev.patika.libraryManagementSystem.dto.request.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryUpdateRequest {
    private long id;
    private String name;
    private String description;
}
