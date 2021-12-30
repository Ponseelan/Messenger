package com.chatApplication.Messenger.ExceptionHandler;

import com.chatApplication.Messenger.Exception.MessengerException;
import com.chatApplication.Messenger.Exception.UserException;
import com.chatApplication.Messenger.Model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MessengerExceptionHandler {
    @ExceptionHandler(MessengerException.class)
    public ResponseEntity<Error> handleMessengerException(MessengerException exception)
    {
        ResponseEntity<Error> responseEntity=new ResponseEntity<Error>(exception.getError(), HttpStatus.INTERNAL_SERVER_ERROR);
        return responseEntity;
    }
}
