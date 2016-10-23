package services.impl;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import repositories.UserCrudRepository;
import services.UserService;
import javax.annotation.security.RolesAllowed;

import java.util.List;

/**
 * Created by DAMIEN6 on 22/10/2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserCrudRepository userCrudRepository;
//EnableGlobalMethodSecurity(prePostEnabled=true) -- this is for using SpEL in your annotations - see below
    @PreAuthorize("hasRole('ROLE_USER')")
    public User findById(Long id) {
        return userCrudRepository.findOne(id);
    }

    public User findByName(String name) {
        return userCrudRepository.findByName(name);
    }

    public User findByNameAndSurname(String name, String surname) {
        return userCrudRepository.findByNameAndSurname(name, surname);
    }

//    Need to enable GlobalMethodSecurity for this Annotation, see config.SpringSecurityConfig
    @Secured({"ROLE_USER"})
//    @Secured("IS_FULLY_AUTHENTICATED")
    public List<User> findAll() {
        return userCrudRepository.findAll();
    }

    @RolesAllowed("ROLE_ADMIN")
//    This annotation uses JSR-250
    public void deleteAll() {
        userCrudRepository.deleteAll();
    }

    public User findOne(Long id) {
        return userCrudRepository.findOne(id);
    }
}
