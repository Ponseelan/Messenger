package com.chatApplication.Messenger.controller;

import com.chatApplication.Messenger.Model.ActionResult;
import com.chatApplication.Messenger.Model.Message;
import com.chatApplication.Messenger.Model.User;
import com.chatApplication.Messenger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ActionResult createUser(@RequestBody(required = true) User user) {
        return userService.createUser(user);
    }

    @PostMapping("/user/send")
    public ActionResult sendMessage(@RequestBody(required = true) Message message) {
        return userService.sendMessage(message);
    }

}
