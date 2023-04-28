package com.teksystems;

import com.teksystems.database.dao.UsersDAO;
import com.teksystems.database.entity.Users;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsersDAOTest {

    @Autowired
    private UsersDAO usersDAO;

    @Test
    public void findByEmailTest() {
        Users u = this.usersDAO.findByEmail("caite@email.com");
        Assertions.assertEquals(u.getEmail(), "caite@email.com");
    }

    @Test
    public void existsByEmailTest() {
        boolean result = this.usersDAO.existsByEmail("caite@email.com");
        Assertions.assertEquals(result, true);
    }

    @Test
    @Order(0)
    public void createUsers() {
        Users u = new Users();
        u.setFirstName("Caitlin");
        u.setLastName("Norse");
        u.setEmail("test@test.com");
        u.setBandYear(4);
        u.setMusicPart(4);
        u.setPassword("password");
        u.setInstrumentId(4);

        usersDAO.save(u);

        Users u2 = usersDAO.findByEmail("test@test.com");
        Assertions.assertEquals(u.getFirstName(), u2.getFirstName());
        Assertions.assertEquals(u.getLastName(), u2.getLastName());
        Assertions.assertEquals(u.getBandYear(), u2.getBandYear());
        Assertions.assertEquals(u.getMusicPart(), u2.getMusicPart());
        Assertions.assertEquals(u.getPassword(), u2.getPassword());
        Assertions.assertEquals(u.getInstrumentId(), u2.getInstrumentId());

    }
    @Test
    @Order(1)
    public void updateUsersTest() {
        //given
        Users given = usersDAO.findByEmail("test@test.com");

        given.setFirstName("Jane");
        given.setLastName("Doe");

        // when
        usersDAO.save(given);

        Users actual = usersDAO.findByEmail("test@test.com");

        Assertions.assertEquals(given.getFirstName(), actual.getFirstName());
        Assertions.assertEquals(given.getLastName(), actual.getLastName());

    }

    @Test
    @Order(2)
    public void deleteUsersTest() {
        Users given = usersDAO.findByEmail("test@test.com");

        usersDAO.delete(given);

        Users actual = usersDAO.findByEmail("test@test.com");
    }

}
