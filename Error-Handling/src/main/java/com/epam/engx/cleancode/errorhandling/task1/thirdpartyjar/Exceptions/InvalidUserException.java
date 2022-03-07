package com.epam.engx.cleancode.errorhandling.task1.thirdpartyjar.Exceptions;

public class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message) {
        super(message);
    }
}