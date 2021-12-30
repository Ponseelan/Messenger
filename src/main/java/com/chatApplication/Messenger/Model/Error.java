package com.chatApplication.Messenger.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Error {
    String entity;
    String message;

    public Error() {
    }

    private Error(String entity, String message) {
        this.entity = entity;
        this.message = message;
    }

    public static Error create(String entity, String message) {
        return new Error(entity,message);
    }
}
