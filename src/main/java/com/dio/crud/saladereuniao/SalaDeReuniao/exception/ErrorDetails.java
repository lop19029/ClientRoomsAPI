package com.dio.crud.saladereuniao.SalaDeReuniao.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String details;

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}