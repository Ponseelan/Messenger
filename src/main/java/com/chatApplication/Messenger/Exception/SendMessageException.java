package com.chatApplication.Messenger.Exception;

import com.chatApplication.Messenger.Model.Error;

public class SendMessageException extends MessengerException {
    public SendMessageException(Error error) {
        super(error);
    }
}
