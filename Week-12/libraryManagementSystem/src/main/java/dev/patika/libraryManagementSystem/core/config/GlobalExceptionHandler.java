package dev.patika.libraryManagementSystem.core.config;

import dev.patika.libraryManagementSystem.core.exception.NotFoundException;
import dev.patika.libraryManagementSystem.core.result.Result;
import dev.patika.libraryManagementSystem.core.utils.ResultHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleValidationErrors(MethodArgumentNotValidException e){

        List<String> validationErrorList = e.getBindingResult().getFieldErrors().stream()
                .map(FieldError::getDefaultMessage).toList();

        return new ResponseEntity<>(ResultHelper.ERROR(validationErrorList), HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Result> handleNotFoundException(NotFoundException e){
        return new ResponseEntity<>(ResultHelper.NOT_FOUND(),HttpStatus.NOT_FOUND);
    }
}
