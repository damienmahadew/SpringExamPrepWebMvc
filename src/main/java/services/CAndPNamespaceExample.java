package services;

import domain.User;

/**
 * Created by DAMIEN6 on 02/11/2016.
 */
public class CAndPNamespaceExample {

    private UserService userService;

    private DateService dateService;

    private TimeServiceSingleton timeServiceSingleton;

    public CAndPNamespaceExample(UserService userService) {
        this.userService = userService;
    }

    public void setDateService(DateService dateService) {
        this.dateService = dateService;
    }

    public void setTimeServiceSingleton(TimeServiceSingleton timeServiceSingleton) {
        this.timeServiceSingleton = timeServiceSingleton;
    }
}
