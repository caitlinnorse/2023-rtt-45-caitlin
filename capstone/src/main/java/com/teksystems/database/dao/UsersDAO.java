package com.teksystems.database.dao;

import com.teksystems.database.entity.Events;
import com.teksystems.database.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersDAO extends JpaRepository<Users, Long> {

    @Query("FROM Users u")
    List<Users> getAllUsers();

    List<Users> findByFirstNameContainingIgnoreCase(String firstName);
    List<Users> findByLastNameContainingIgnoreCase(String lastName);

    List<Users> findByFirstNameContainingOrLastNameContainingIgnoreCase(String firstName, String lastName);
}
