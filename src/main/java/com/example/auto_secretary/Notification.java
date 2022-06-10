package com.example.auto_secretary;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Notification {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @OneToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event event;
    private LocalDate notification_time;
}
