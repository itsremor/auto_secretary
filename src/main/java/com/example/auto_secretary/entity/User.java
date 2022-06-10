package com.example.auto_secretary.entity;

import javax.persistence.*;
@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    private String name;
    private String surname;
    private String emil;
    private String password;

    @OneToOne
    @JoinColumn(name = "departament_id", referencedColumnName = "id")
    private Departament departament;

    @OneToOne
    @JoinColumn(name = "position_id", referencedColumnName = "id")
    private Position position;
}
