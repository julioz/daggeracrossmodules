package com.zynger.daggeracrossmodules.racecar;

import com.zynger.collaborators.Seat;

import javax.inject.Inject;

public class LeatherSeat implements Seat {

    @Inject
    public LeatherSeat() {
    }

    @Override
    public String toString() {
        return "made of leather";
    }
}
