package com.chatApplication.Messenger.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Messages")
@Getter
@Setter
public class Message {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "fromid")
    @JsonIgnore
    private Long fromId;
    @Column(name = "toid")
    @JsonIgnore
    private Long toId;
    private String Message;
    public MessageStatus status;
    @Column(updatable = false,insertable = false)
    @JsonProperty(value = "sender")
    private String sender;
    public Message() {
        status=MessageStatus.CREATED;
    }
}
