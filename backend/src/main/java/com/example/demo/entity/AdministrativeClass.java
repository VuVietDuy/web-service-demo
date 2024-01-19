package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "administrative_class")
public class AdministrativeClass {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "instructor")
    private String instructor;

    @Column(name = "major")
    private String major;

    @Column(name = "created_at")
    private String createdAt;
}
