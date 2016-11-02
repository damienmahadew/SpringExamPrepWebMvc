package services;

import domain.User;

/**
 * Created by DAMIEN6 on 02/11/2016.
 */
public class UserServiceFactory {

    public User create() {
        return new User();
    }
}
