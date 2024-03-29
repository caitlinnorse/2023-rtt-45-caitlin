package com.teksystems.database.dao;

import com.teksystems.database.entity.Events;
import com.teksystems.database.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface UsersDAO extends JpaRepository<Users, Long> {

    Users findByEmail(String email);

    boolean existsByEmail(String email);




}
