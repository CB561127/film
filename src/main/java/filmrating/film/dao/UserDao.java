package filmrating.film.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import filmrating.film.bean.User;
import org.springframework.stereotype.Component;

@Component
public interface UserDao extends JpaRepository<User,Integer> {
}
