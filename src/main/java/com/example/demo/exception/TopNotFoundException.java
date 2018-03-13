package com.example.demo.exception;

public class TopNotFoundException extends RuntimeException{
    public TopNotFoundException(String message) {
        super(message);
    }

    public TopNotFoundException() {
    }
}
