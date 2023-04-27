package springframework.database.dao;

import lombok.experimental.StandardException;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import springframework.database.dao.EmployeeDAO;
import springframework.database.entity.Employee;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeDAOTest {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Test
    public void findAllWithOfficeNameTest() {
        employeeDAO.findAllWithOfficeName();
    }

    @Test
    public void findbById() {
        Employee e = employeeDAO.findById(1002);

        Assertions.assertEquals(e.getFirstName(), "Diane");
        Assertions.assertEquals(e.getLastName(), "Murphy");

    }

    @Test
    @Order(0)
    public void createUser() {
        Employee e = new Employee();
        e.setEmail("test@test.com");
        e.setFirstName("John");
        e.setLastName("Doe");
        e.setJobTitle("Manager");
        e.setExtension("blah");
        e.setOfficeId(1);
        e.setReportsTo(1002);

        employeeDAO.save(e);

        Employee e2 = employeeDAO.findByEmail("test@test.com");

        Assertions.assertEquals(e.getFirstName(), e2.getFirstName());
        Assertions.assertEquals(e.getLastName(), e2.getLastName());
        Assertions.assertEquals(e.getJobTitle(), e2.getJobTitle());
        Assertions.assertEquals(e.getExtension(), e2.getExtension());
        Assertions.assertEquals(e.getOfficeId(), e2.getOfficeId());
        Assertions.assertEquals(e.getReportsTo(), e2.getReportsTo());

    }

    @Test
    @Order(1)
    public void updateEmployeeTest() {
        //given
        Employee given = employeeDAO.findByEmail("test@test.com");

        given.setFirstName("Jane");
        given.setLastName("Doe");

        // when
        employeeDAO.save(given);

        Employee actual = employeeDAO.findByEmail("test@test.com");

        Assertions.assertEquals(given.getFirstName(), actual.getFirstName());
        Assertions.assertEquals(given.getLastName(), actual.getLastName());

    }

    @Test
    @Order(2)
    public void deleteExmployeeTest() {
        Employee given = employeeDAO.findByEmail("test@test.com");

        employeeDAO.delete(given);

        Employee actual = employeeDAO.findByEmail("test@test.com");
    }

}
