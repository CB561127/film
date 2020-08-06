package filmrating.film.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import filmrating.film.dao.ReviewDao;

@Service
public class ReviewService {
    @Autowired
    ReviewDao reviewDao;
}
