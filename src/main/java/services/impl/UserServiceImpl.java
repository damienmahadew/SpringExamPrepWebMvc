package services.impl;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.UserCrudRepository;
import services.UserService;

/**
 * Created by DAMIEN6 on 22/10/2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserCrudRepository userCrudRepository;

    public User findById(Long id) {
        return userCrudRepository.findOne(id);
    }
}
