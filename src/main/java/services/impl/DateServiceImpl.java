package services.impl;

import domain.SpecialDate;
import services.DateService;

/**
 * Created by DAMIEN6 on 02/11/2016.
 */
public class DateServiceImpl implements DateService {

    private SpecialDate specialDate;

    public SpecialDate getSpecialDate() {
        return specialDate;
    }

    public void setSpecialDate(SpecialDate specialDate) {
        this.specialDate = specialDate;
    }
}
