package com.chatApplication.Messenger.repository;

import com.chatApplication.Messenger.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CustomMessageRepositoryImpl implements  CustomMessageRepository{
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Message> getMessageByUserId(Long userId) {
        var query=entityManager.createNativeQuery("select Messages.*,sender.firstname Sender " +
                "from Messages inner join Users on toid=Users.Id AND Users.id= :userId inner join Users sender ON sender.id=fromid", Message.class);
       query.setParameter("userId",userId);
       List<Message> result= query.getResultList();
       return result;
    }
}
