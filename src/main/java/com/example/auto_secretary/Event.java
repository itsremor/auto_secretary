package com.example.auto_secretary;

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

    @OneToOne
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    private Room room;
}
