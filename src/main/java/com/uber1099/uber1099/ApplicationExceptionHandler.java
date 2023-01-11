package com.uber1099.uber1099;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.uber1099.uber1099.exception.ErrorResponse;
import com.uber1099.uber1099.exception.NoUserException;

@ControllerAdvice
public class ApplicationExceptionHandler {
    @ExceptionHandler(NoUserException.class)
    public ResponseEntity<Object> handleNoUserFound(NoUserException ex){
        ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    
}
