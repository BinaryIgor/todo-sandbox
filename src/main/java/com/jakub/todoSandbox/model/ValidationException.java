package com.jakub.todoSandbox.model;

public class ValidationException extends RuntimeException {

    public ValidationException(String message) {
        super(message);
    }
}
