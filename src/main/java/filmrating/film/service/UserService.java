package filmrating.film.service;

import org.springframework.beans.factory.annotation.Autowired;
import filmrating.film.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

}
