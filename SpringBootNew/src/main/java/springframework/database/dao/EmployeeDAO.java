package springframework.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springframework.database.entity.Employee;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    // this is a JPA hibernate query
    @Query(value="FROM Employee e")
    List<Employee> getAllEmployees();


    //List<Employee> findByFirstNameContainingOrLastNameContainingIgnoreCase(String firstName, String lastName);

//    @Query(value="select * from employees where firstname like %:firstName% or lastname like %:lastName%", nativeQuery = true)
//    List<Employee> usingNativeQuery(String firstName, String lastName);

    @Query("select e from Employee e where e.firstName like %:firstName% or e.lastName like %:lastName%")
    List<Employee> usingJPAQuery(String firstName, String lastName);

}
