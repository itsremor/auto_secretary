package com.example.auto_secretary.entity;

import javax.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    private String room_name;

    @OneToOne
    @JoinColumn(name = "departament_id", referencedColumnName = "id")
    private Departament departament;
}
