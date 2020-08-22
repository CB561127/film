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
public class SearchController {
    @Autowired
    FilmService filmService;

    @CrossOrigin
    @PostMapping("/search/{searchStr}")
    public List<Film> searchAll(@PathVariable("searchStr")String str){
            List<Film> l1 = filmService.findByNameLike(str);
            List<Film> l2 = filmService.findByDescription(str);
            List<Film> l3 = filmService.findByCastLike(str);
            List<Film> l4 = filmService.findByTypeLike(str);
            List<Film> list = new ArrayList<Film>();
            list.addAll(l1);
            list.addAll(l2);
            list.addAll(l3);
            list.addAll(l4);

        if(list.size() != 0){
            for(int i = 0;i < list.size();i++){
                for(int j = 0;j < list.size();j++){
                    if((list.get(i).getFid() == list.get(j).getFid())&&(i != j)){
                        list.remove(j);
                    }
                }
            }
        }else{
            System.out.println("没找到");
        }
        return list;
    }
}

















