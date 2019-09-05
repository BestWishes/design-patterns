package com.wishes.design.strategy;

import com.wishes.design.strategy.destination.HomeDesti;
import com.wishes.design.strategy.destination.JZGDes;
import com.wishes.design.strategy.travel.BusTravel;
import com.wishes.design.strategy.travel.WalkingTravel;
import com.wishes.design.strategy.user.User;
import com.wishes.design.strategy.user.YongUser;
import org.junit.Test;

public class UserTest {

    @Test
    public void dynamicGoTravel() {
        User user = new YongUser();
        user.setTravel(new BusTravel());
        user.setDesti(new JZGDes());
        user.go();
        user.setTravel(new WalkingTravel());
        user.setDesti(new HomeDesti());
        user.go();
    }
}