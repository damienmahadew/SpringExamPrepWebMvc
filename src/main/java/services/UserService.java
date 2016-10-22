package services;

import domain.User;

/**
 * Created by DAMIEN6 on 22/10/2016.
 */
public interface UserService {

    User findById(Long id);
}
