package com.zynger.collaborators;

public abstract class Engine {
    private EnginePump pump;

    public Engine(EnginePump pump) {
        this.pump = pump;
    }

    @Override
    public String toString() {
        return pump.toString() + "-using";
    }
}
