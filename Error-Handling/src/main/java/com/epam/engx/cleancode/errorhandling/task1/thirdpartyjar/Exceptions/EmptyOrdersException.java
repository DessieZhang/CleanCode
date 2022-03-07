package com.epam.engx.cleancode.errorhandling.task1.thirdpartyjar.Exceptions;

public class EmptyOrdersException extends RuntimeException {
    public EmptyOrdersException(String message) {
        super(message);
    }
}