package filmrating.film.controller;

import filmrating.film.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import filmrating.film.service.FilmService;

@RestController
@RequestMapping("/film")
@CrossOrigin
public class LanternController {
    @Autowired
    FilmService filmService;
}
