package com.guilherme.emailservice.adapters;

public interface EmailSenderGateway {
    void senEmail(String to, String subject, String body);
}
