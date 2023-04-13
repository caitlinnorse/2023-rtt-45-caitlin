package com.teksystems.database.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "vendors")
public class Vendors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String vName;

    @Column(name="description")
    private String description;

    @Column(name="event_id")
    private Integer eventId;
}
