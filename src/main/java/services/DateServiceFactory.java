package services;

import domain.SpecialDate;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by DAMIEN6 on 02/11/2016.
 */
//Implement factory bean to avoid complex xml oonfig -- still need to declare in xml though
public class DateServiceFactory implements FactoryBean<SpecialDate> {
    public SpecialDate getObject() throws Exception {
        return new SpecialDate();
    }

    public Class<?> getObjectType() {
        return SpecialDate.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
