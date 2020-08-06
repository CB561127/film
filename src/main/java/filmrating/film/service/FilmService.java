package filmrating.film.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import filmrating.film.bean.Film;
import filmrating.film.dao.FilmDao;

import java.util.Date;
import java.util.List;

@Service
public class FilmService {
    @Autowired
    FilmDao filmDao;

    public List<Film> findByCastLike(String cast){return filmDao.findByCastLike("%"+cast+"%");}
    public List<Film> findByNameLike(String name){return filmDao.findByNameLike("%"+name+"%");}
    public List<Film> findByTypeLike(String type){return filmDao.findByTypeLike("%"+type+"%");}
    public List<Film> findByCountry(String country){return filmDao.findByCountryLike("%"+country+"%");}
    public List<Film> findByScore(double score){return filmDao.findByScore(score);}
    public List<Film> findByTime(Date time){return filmDao.findByTime(time);}
}
