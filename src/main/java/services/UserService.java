package services;

import domain.User;

import java.util.List;

/**
 * Created by DAMIEN6 on 22/10/2016.
 */
public interface UserService {

    User findById(Long id);
    User findByName(String name);
    User findByNameAndSurname(String name, String surname);
    List<User> findAll();
    void deleteAll();
    User findOne(Long id);
}
