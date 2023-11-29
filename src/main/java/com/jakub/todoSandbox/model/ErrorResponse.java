package com.jakub.todoSandbox.model;

public record ErrorResponse(String error, String message) {

    public static ErrorResponse fromException(Throwable exception) {
        return new ErrorResponse(exception.getClass().getSimpleName(), exception.getMessage());
    }
}