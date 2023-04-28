package com.teksystems;

import com.teksystems.database.dao.EventsDAO;
import com.teksystems.database.entity.Events;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@SpringBootTest
public class EventDAOTest {

    @Autowired
    private EventsDAO eventsDAO;

    @Test
    public void getAllEventsTest() {
        eventsDAO.getAllEvents();
    }

    @Test
    public void findById() {
        Events e = this.eventsDAO.findById(2);
        Assertions.assertEquals(e.getEventName(), "Penn State Basketball VS Illinois");
        Assertions.assertEquals(e.getEventType(), "Basketball");

    }

}
