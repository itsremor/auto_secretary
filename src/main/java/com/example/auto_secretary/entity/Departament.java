package com.example.auto_secretary.entity;

import javax.persistence.*;

@Entity
public class Departament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    public Departament(String name) {
        this.name = name;
    }

    public Departament() {
    }

    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String departament_name) {
        this.name = departament_name;
    }
}
