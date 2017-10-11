package com.zynger.daggeracrossmodules.racecar;

import com.zynger.collaborators.Engine;
import com.zynger.collaborators.EnginePump;

public class RacingEngine extends Engine {

    public RacingEngine(EnginePump pump) {
        super(pump);
    }

    @Override
    public String toString() {
        return super.toString() + " (super fast racing engine)";
    }
}
