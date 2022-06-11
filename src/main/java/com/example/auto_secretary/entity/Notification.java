package com.example.auto_secretary.entity;

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

    public Notification() {
    }

    public Notification(Event event, LocalDate notification_time) {
        this.event = event;
        this.notification_time = notification_time;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setNotification_time(LocalDate notification_time) {
        this.notification_time = notification_time;
    }

    public long getId() {
        return id;
    }

    public Event getEvent() {
        return event;
    }

    public LocalDate getNotification_time() {
        return notification_time;
    }
}
