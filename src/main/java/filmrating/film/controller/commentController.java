package filmrating.film.controller;


import filmrating.film.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/comments")
@CrossOrigin
public class commentController {

    @Autowired
    ReviewService reviewService;

    @RequestMapping("/{commentsValue}")
    public String writeDataBase(@PathVariable String commentsValue){
        System.out.println("nice");
        return "成功";
    }
}
