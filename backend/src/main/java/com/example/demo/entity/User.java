package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "password",nullable = false)
    private String password;

    public User(String username, String password) {
        username = username;
        password = password;
    }
}
