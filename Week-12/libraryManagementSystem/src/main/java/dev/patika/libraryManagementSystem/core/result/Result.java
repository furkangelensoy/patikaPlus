package dev.patika.libraryManagementSystem.core.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private boolean status;
    private String message;
    private String httpCode;
}
