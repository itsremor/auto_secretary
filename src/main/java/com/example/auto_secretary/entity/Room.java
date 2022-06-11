package com.example.auto_secretary.entity;

import javax.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    public Room() {
    }

    public Room(String room_name, Departament departament) {
        this.room_name = room_name;
        this.departament = departament;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public long getId() {
        return id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public Departament getDepartament() {
        return departament;
    }

    private String room_name;

    @OneToOne
    @JoinColumn(name = "departament_id", referencedColumnName = "id")
    private Departament departament;
}
