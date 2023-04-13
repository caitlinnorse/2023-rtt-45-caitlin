package springframework.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import springframework.database.entity.Office;
import springframework.database.entity.User;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Long> {
    User findByEmail(String email);

}
