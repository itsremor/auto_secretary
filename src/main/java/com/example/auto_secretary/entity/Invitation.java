package com.example.auto_secretary.entity;

import javax.persistence.*;

@Entity
public class Invitation {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    public Invitation() {
    }

    public Invitation(User user, Event event) {
        this.user = user;
        this.event = event;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Event getEvent() {
        return event;
    }

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event event;
}
