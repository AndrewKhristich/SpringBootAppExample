package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class TopNotFoundException extends RuntimeException{
    public TopNotFoundException(String message) {
        super(message);
    }

    public TopNotFoundException() {
    }
}
