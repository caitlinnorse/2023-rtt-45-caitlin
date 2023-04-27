package com.teksystems.formbeans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class EventsFormBean {

    private Integer id;

    private String eventName;

    private Date date;

    private String location;

    private String otherEvents;

    private String eventType;

    public String profileImage;

}
