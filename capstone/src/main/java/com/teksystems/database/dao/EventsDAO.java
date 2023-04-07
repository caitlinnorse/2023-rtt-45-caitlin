package com.teksystems.database.dao;

import com.teksystems.database.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventsDAO extends JpaRepository<Events, Long> {

    @Query("FROM Events e")
    List<Events> getAllEvents();

    //List<Events> findByNameContainingIgnoreCase(String name);

}
