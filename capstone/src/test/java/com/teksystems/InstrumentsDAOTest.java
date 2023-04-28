package com.teksystems;

import com.teksystems.database.dao.InstrumentsDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InstrumentsDAOTest {

    @Autowired
    private InstrumentsDAO instrumentsDAO;

    @Test
    public void getAllInstrumentsTest(){
        instrumentsDAO.getAllInstruments();
    }
}
