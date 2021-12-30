package com.chatApplication.Messenger.Model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
@Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @JsonFormat(pattern="dd/MM/yy")
    @Column(name = "dateofbirth")
    private Date dateOfBirth;
    @Column(unique = true,name = "loginid")
    private String loginId;

    public User() {
    }
}
