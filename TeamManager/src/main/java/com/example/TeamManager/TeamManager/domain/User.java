package com.example.TeamManager.TeamManager.domain;


import lombok.Data;

import javax.persistence.*;

@Entity(name = "User")
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}
