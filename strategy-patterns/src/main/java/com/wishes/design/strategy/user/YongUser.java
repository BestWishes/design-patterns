package com.wishes.design.strategy.user;

import com.wishes.design.strategy.destination.HomeDesti;
import com.wishes.design.strategy.travel.WalkingTravel;

public class YongUser extends User {
    public YongUser() {
        setTravel(new WalkingTravel());
        setDesti(new HomeDesti());
    }

    @Override
    public void go() {
        getDesti().des();
        getTravel().go();
    }
}
