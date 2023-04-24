package com.teksystems.database.dao;

import com.teksystems.database.entity.Events;
import com.teksystems.database.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface EventsDAO extends JpaRepository<Events, Long> {

    @Query("FROM Events e")
    List<Events> getAllEvents();

    Events findById(Integer id);
    List<Events> findByEventNameContainingIgnoreCaseOrEventTypeContainingIgnoreCase(String name, String type);

    @Query(value="select u.first_name, u.last_name, u.email, i.instrument_name, u.music_part, u.band_year from users u, " +
            "user_event ue, events e, instruments i where ue.user_id = u.id AND ue.event_id = e.id " +
            "AND ue.instrument_id = i.id AND e.id = :eventId", nativeQuery = true)
    List<Map<String, Object>> findUsersForEvent(Integer eventId);

}
