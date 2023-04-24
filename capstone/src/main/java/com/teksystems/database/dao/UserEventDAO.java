package com.teksystems.database.dao;

import com.teksystems.database.entity.UserEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserEventDAO extends JpaRepository<UserEvent, Long> {

    UserEvent findByEventIdAndUserId(Integer eventId, Integer userId);


}
