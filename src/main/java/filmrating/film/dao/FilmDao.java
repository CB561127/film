package filmrating.film.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import filmrating.film.bean.Film;

import java.util.Date;
import java.util.List;

@Component
public interface FilmDao extends JpaRepository<Film,Integer> {

    List<Film> findByNameLike(String name);
    List<Film> findByTime(Date time);
    List<Film> findByTypeLike(String type);
    List<Film> findByCastLike(String cast);
    List<Film> findByScore(Double score);
    List<Film> findByCountryLike(String country);
    List<Film> findByWesttag(String tag);
    List<Film> findByDescriptionLike(String str);

}
