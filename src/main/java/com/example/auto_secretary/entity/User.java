package com.example.auto_secretary.entity;

import javax.persistence.*;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String name;
    private String surname;
    private String emil;
    private String password;

    @OneToOne
    @JoinColumn(name = "departament", referencedColumnName = "id")
    private Departament departament;

    @OneToOne
    @JoinColumn(name = "position", referencedColumnName = "id")
    private Position position;

    public User() {
    }

    public User(String name, String surname, String emil, String password, Departament departament, Position position) {
        this.name = name;
        this.surname = surname;
        this.emil = emil;
        this.password = password;
        this.departament = departament;
        this.position = position;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmil() {
        return emil;
    }

    public String getPassword() {
        return password;
    }

    public Departament getDepartament() {
        return departament;
    }

    public Position getPosition() {
        return position;
    }
}
