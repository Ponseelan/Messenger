package com.chatApplication.Messenger.repository;

import com.chatApplication.Messenger.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long>,CustomMessageRepository {
}
