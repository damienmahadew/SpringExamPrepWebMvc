package services;

/**
 * Created by DAMIEN6 on 02/11/2016.
 */
public class TimeServiceSingleton {

    private static TimeServiceSingleton timeServiceSingleton = new TimeServiceSingleton();

    private TimeServiceSingleton() {
    }

    public static TimeServiceSingleton getInstance() {
        return timeServiceSingleton;
    }
}
