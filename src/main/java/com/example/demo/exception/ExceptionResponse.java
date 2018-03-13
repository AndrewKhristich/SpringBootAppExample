package com.example.demo.exception;

import java.util.Date;

public class ExceptionResponse {

    private Date timestamp;

    private String message;


    public ExceptionResponse(Date date, String message) {
        this.timestamp = date;
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
