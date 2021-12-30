package com.chatApplication.Messenger.service;

import com.chatApplication.Messenger.Exception.UserException;
import com.chatApplication.Messenger.Model.*;
import com.chatApplication.Messenger.Model.Error;
import com.chatApplication.Messenger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageService messageService;

    public ActionResult createUser(User user)
    {
        ActionResult response;
        try {
            var userCreated = userRepository.save(user);
            response= ActionResult.create("USER",String.valueOf(userCreated.getId()),"CREATE");
        }
        catch(Exception e)
        {
            var error=Error.create("User",e.getMessage());
            throw new UserException(error);
        }
        return response;
    }

    public ActionResult sendMessage(Message message) {
       return messageService.sendMessage(message);
    }
}
