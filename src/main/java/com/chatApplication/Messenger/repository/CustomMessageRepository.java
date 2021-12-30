package com.chatApplication.Messenger.repository;

import com.chatApplication.Messenger.Model.Message;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomMessageRepository {
    List<Message> getMessageByUserId(Long userId);
}
