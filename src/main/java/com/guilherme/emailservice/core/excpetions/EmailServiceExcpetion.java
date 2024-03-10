package com.guilherme.emailservice.core.excpetions;

public class EmailServiceExcpetion extends RuntimeException{

    public EmailServiceExcpetion(String message){
        super(message);
    }

    public EmailServiceExcpetion(String message, Throwable cause){
        super(message, cause);
    }
}
