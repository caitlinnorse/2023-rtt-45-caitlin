package springframework.database.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springframework.database.dao.EmployeeDAO;
import springframework.database.entity.Employee;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
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
}
