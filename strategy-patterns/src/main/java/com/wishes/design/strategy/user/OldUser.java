package com.wishes.design.strategy.user;

import com.wishes.design.strategy.destination.JZGDes;
import com.wishes.design.strategy.travel.BusTravel;

public class OldUser extends User {

    public OldUser() {
        setTravel(new BusTravel());
        setDesti(new JZGDes());
    }

    @Override
    public void go() {
        getDesti().des();
        getTravel().go();
    }
}
