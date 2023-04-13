package springframework.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import springframework.database.entity.Employee;

import java.util.List;
import java.util.Map;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    // this is a JPA hibernate query
    @Query("FROM Employee e")
    List<Employee> getAllEmployees();

    Employee findById(Integer id);

    Employee findByEmail(String email);
    boolean existsByEmail(String email);

    List<Employee> findByFirstNameContainingIgnoreCase(String firstName);
    List<Employee> findByLastNameContainingIgnoreCase(String lastName);

    List<Employee> findByFirstNameContainingOrLastNameContainingIgnoreCase(String firstName, String lastName);


    @Query(value=" select e.*, o.city, e.job_title as 'jobTitle' from employees e, offices o where e.office_id = o.id", nativeQuery=true)
    List<Map<String,Object>> findAllWithOfficeName();

    // @Query(value="select * from employees where lower(firstname) = lower(:firstName);", nativeQuery = true)
    //List<Employee> usingNativeQuery(String firstName, String lastName);

    //@Query("Select e from Employee e where lower(e.firstName) = lower(:firstName)")
    //List<Employee> usingJPAQuery(String firstName, String lastName);
}
