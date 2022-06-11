package com.example.auto_secretary.entity;

import javax.persistence.*;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private String position_name;
    private boolean is_manager;

    public Position() {
    }

    public Position(String position_name, boolean is_manager) {
        this.position_name = position_name;
        this.is_manager = is_manager;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    public void setIs_manager(boolean is_manager) {
        this.is_manager = is_manager;
    }

    public long getId() {
        return id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public boolean isIs_manager() {
        return is_manager;
    }
}
