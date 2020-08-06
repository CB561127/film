package filmrating.film.dao;

import filmrating.film.bean.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ReviewDao extends JpaRepository<Review,Integer> {
}
