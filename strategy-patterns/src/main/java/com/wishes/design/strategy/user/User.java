package com.wishes.design.strategy.user;

import com.wishes.design.strategy.destination.Desti;
import com.wishes.design.strategy.travel.Travel;

/**
 * 用户类
 *
 * @author liujunjie
 */
public abstract class User {

    private Desti desti;

    private Travel travel;

    public abstract void go();

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }
    public Desti getDesti() {
        return desti;
    }

    public void setDesti(Desti desti) {
        this.desti = desti;
    }
}
