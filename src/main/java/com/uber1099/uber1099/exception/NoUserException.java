package com.uber1099.uber1099.exception;

public class NoUserException extends RuntimeException{
    public NoUserException(String id){
        super("The user with id of " + id + " does not match anything in our record.");
    }
}
