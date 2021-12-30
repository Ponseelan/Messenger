package com.chatApplication.Messenger.Exception;

import com.chatApplication.Messenger.Model.Error;
import lombok.Getter;

@Getter
public class MessengerException extends RuntimeException{
    private Error error;

    public MessengerException(Error error) {
        this.error = error;
    }
}
