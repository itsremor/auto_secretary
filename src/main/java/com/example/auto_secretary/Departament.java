package com.example.auto_secretary;

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

    private String departament_name;
}
