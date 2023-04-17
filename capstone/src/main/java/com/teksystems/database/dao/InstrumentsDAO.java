package com.teksystems.database.dao;

import com.teksystems.database.entity.Instruments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InstrumentsDAO extends JpaRepository<Instruments, Long> {
    @Query("FROM Instruments")
    List<Instruments> getAllInstruments();
}
