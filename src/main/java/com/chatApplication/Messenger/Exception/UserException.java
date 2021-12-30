package com.chatApplication.Messenger.Exception;

import com.chatApplication.Messenger.Model.Error;
import lombok.Getter;

@Getter
public class UserException extends MessengerException{
    public UserException(Error error) {
        super(error);
    }
}
