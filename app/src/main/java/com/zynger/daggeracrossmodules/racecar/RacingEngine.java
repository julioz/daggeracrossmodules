package com.zynger.daggeracrossmodules.racecar;

import com.zynger.collaborators.Engine;

import javax.inject.Inject;

public class RacingEngine implements Engine {

    @Inject
    public RacingEngine() {
    }

    @Override
    public String toString() {
        return "super fast racing engine";
    }
}
