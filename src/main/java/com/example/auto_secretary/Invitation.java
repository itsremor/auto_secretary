package com.example.auto_secretary;

import javax.persistence.*;

@Entity
public class Invitation {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event event;
}
