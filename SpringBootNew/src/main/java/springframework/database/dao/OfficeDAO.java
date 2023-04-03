package springframework.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springframework.database.entity.Employee;
import springframework.database.entity.Office;

import java.util.List;
import java.util.Spliterator;

public interface OfficeDAO extends JpaRepository<Office, Long> {
    @Query("FROM Office o order by o.city asc")
    List<Office> getAllOffices();

}
