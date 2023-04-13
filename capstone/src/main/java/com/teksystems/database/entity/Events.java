package com.teksystems.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@Table(name = "events")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String eventName;

    @Column(name="date")
    private Date date;

    @Column(name="location")
    private String location;

    @Column(name="other_events")
    private String otherEvents;

    @Column(name="event_type")
    private String eventType;
}
