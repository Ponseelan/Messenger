package com.chatApplication.Messenger.controller;

import com.chatApplication.Messenger.Model.Message;
import com.chatApplication.Messenger.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;
    @GetMapping("/message")
    List<Message> getMessageForGivenUser(@RequestParam(required = true) Long userId)
    {
        return messageService.getMessages(userId);
    }
}
