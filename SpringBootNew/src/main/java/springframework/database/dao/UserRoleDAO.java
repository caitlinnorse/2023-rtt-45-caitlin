package springframework.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springframework.database.entity.UserRole;

import java.util.List;

public interface UserRoleDAO extends JpaRepository<UserRole, Long> {

    List<UserRole> findByUserId(Integer id);
}
