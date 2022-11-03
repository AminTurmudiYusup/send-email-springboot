package com.example.email.model;

import lombok.Data;

@Data
public class EmailDetails {
    private String recipient;
    private String subject;
    private String message;
}
