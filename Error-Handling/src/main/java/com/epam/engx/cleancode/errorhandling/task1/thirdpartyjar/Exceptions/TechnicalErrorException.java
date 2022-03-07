package com.epam.engx.cleancode.errorhandling.task1.thirdpartyjar.Exceptions;

public class TechnicalErrorException extends RuntimeException {
    public TechnicalErrorException(String message) {
        super(message);
    }
}
