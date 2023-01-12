package com.uber1099.uber1099;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.uber1099.uber1099.exception.ErrorResponse;
import com.uber1099.uber1099.exception.NoUserException;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(NoUserException.class)
    public ResponseEntity<Object> handleNoUserFound(NoUserException ex){
        ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        for (ObjectError error : ex.getBindingResult().getAllErrors()) {
            System.out.println(error.getDefaultMessage());
        } 
        // return super.handleMethodArgumentNotValid(ex, headers, status, request);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
