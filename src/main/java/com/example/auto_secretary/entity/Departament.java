package com.example.auto_secretary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Departament {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    public Departament(String departament_name) {
        this.departament_name = departament_name;
    }

    public Departament() {
    }

    private String departament_name;

    public long getId() {
        return id;
    }

    public String getDepartament_name() {
        return departament_name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDepartament_name(String departament_name) {
        this.departament_name = departament_name;
    }
}
