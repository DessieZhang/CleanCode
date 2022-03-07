package com.epam.engx.cleancode.errorhandling.task1.thirdpartyjar.Exceptions;

public class InvalidOrderAmountException extends RuntimeException {
    public InvalidOrderAmountException(String message) {
        super(message);
    }
}
