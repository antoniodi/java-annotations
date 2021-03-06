package com.anthonydi.application.acl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Message {

    @Value( "${message}" )
    private String message;

    public String getMessage() {
        return message;
    }
}
