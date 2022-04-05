package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

    SomeCdiDao someCdiDao;

    @Inject
    public SomeCdiBusiness(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public SomeCdiDao getSomeCdiDao() {
        return someCdiDao;
    }

    public void setSomeCdiDao(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }
}
