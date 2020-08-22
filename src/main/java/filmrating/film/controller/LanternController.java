package filmrating.film.controller;

import filmrating.film.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import filmrating.film.bean.Film;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/film")
@CrossOrigin
public class LanternController {
    @Autowired
    FilmService filmService;

    @GetMapping("/getLantern")
    @CrossOrigin
    public List<Film> getNum(){
        List<Film> list = filmService.findByWesttag("欧美");
        System.out.println("测试用");
        return list;
    }

    @CrossOrigin
    @GetMapping("/firstByCountry/{country}")
    public List<Film> getFirstByCountry(@PathVariable("country") String country){
        List<Film> list = filmService.findByWesttag(country);
        if(list.size() == 0){
            list = filmService.findByCountry(country);
        }
        list = filmService.sortByTime(list);
        list = filmService.getTen(list,12);
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i).toString());
        }
        return list;
    }

    @CrossOrigin
    @GetMapping("/sortByTime")
    public List<Film> sortByTime(){
        List<Film> list = filmService.getAll();
        List<Film> l = filmService.sortByTime(list);
        l = filmService.getTen(l,12);
        for(int i = 0;i < l.size();i++){
            System.out.println(l.get(i).toString());
        }
        return l;
    }
}
