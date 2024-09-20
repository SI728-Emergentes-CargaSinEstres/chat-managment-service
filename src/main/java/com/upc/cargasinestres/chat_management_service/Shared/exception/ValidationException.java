package com.upc.cargasinestres.chat_management_service.Shared.exception;

/**
 * This exception is thrown when a validation error occurs.
 */
public class ValidationException extends RuntimeException{
    public ValidationException() {
        super();
    }

    public ValidationException(String message) {
        super(message);
    }
}
