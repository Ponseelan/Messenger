package com.chatApplication.Messenger.service;

import com.chatApplication.Messenger.Exception.MessengerException;
import com.chatApplication.Messenger.Exception.SendMessageException;
import com.chatApplication.Messenger.Model.ActionResult;
import com.chatApplication.Messenger.Model.Error;
import com.chatApplication.Messenger.Model.Message;
import com.chatApplication.Messenger.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public ActionResult sendMessage(Message message)
    {
        ActionResult actionResult;
        try {
            var messageResponse = messageRepository.save(message);
            actionResult=ActionResult.create("Message",String.valueOf(messageResponse.getId()),"SEND MESSAGE");
        }
        catch(Exception exception)
        {
            var error= Error.create("Message", exception.getMessage());
            throw new SendMessageException(error);
        }
        return actionResult;
    }

    public List<Message> getMessages(Long userId)
    {
        List<Message> messages;
        try {
            messages= messageRepository.getMessageByUserId(userId);
        }
        catch(Exception ex)
        {
            var error=Error.create("MESSAGE", ex.getMessage());
            throw new MessengerException(error);
        }
        return messages;
    }
}
