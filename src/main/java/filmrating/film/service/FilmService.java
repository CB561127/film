package filmrating.film.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import filmrating.film.bean.Film;
import filmrating.film.dao.FilmDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FilmService {
    @Autowired
    FilmDao filmDao;

    public List<Film> findByCastLike(String cast){return filmDao.findByCastLike("%"+cast+"%");}
    public List<Film> findByNameLike(String name){return filmDao.findByNameLike("%"+name+"%");}
    public List<Film> findByTypeLike(String type){return filmDao.findByTypeLike("%"+type+"%");}
    public List<Film> findByDescription(String str){return filmDao.findByDescriptionLike("%"+str+"%");}
    public List<Film> findByCountry(String country){return filmDao.findByCountryLike("%"+country+"%");}
    public List<Film> findByScore(double score){return filmDao.findByScore(score);}
    public List<Film> findByTime(Date time){return filmDao.findByTime(time);}
    public List<Film> findByWesttag(String tag){return filmDao.findByWesttag(tag);}
    public List<Film> getAll(){return filmDao.findAll();}

    public List<Film> sortByTime(List<Film> list){
        for(int i = 0;i < list.size();i++){
            for(int j = 0;j < list.size()-i-1;j++){
                if((list.get(j).getTime().compareTo(list.get(j+1).getTime()))==-1){
                    Film mid = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,mid);
                }
            }
        }
        return list;
    }

    public List<Film> getTen(List<Film> list,int len){
        List<Film> result = new ArrayList<Film>();
        int num = len;
        if(list.size() < len){
            num = list.size();
        }
        for(int i = 0;i < num;i++){
            result.add(list.get(i));
        }
        return result;
    }
}
