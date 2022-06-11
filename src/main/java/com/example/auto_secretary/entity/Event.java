package com.example.auto_secretary.entity;

import javax.persistence.*;
import java.time.*;

@Entity
public class Event {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    private String event_name;
    private LocalDate start;
    private LocalDate end;

    public Event() {
    }

    public Event(String event_name, LocalDate start, LocalDate end, Room room) {
        this.event_name = event_name;
        this.start = start;
        this.end = end;
        this.room = room;
    }

    @OneToOne
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    private Room room;
}
