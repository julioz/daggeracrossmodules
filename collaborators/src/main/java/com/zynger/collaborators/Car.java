package com.zynger.collaborators;

import android.util.Log;

public class Car {
    private static final String TAG = "Car";

    private final Engine engine;
    private final Seat seat;
    private final WheelSet wheelSet;

    public Car(Engine engine, Seat seat, WheelSet wheelSet) {
        this.engine = engine;
        this.seat = seat;
        this.wheelSet = wheelSet;
    }

    public void start() {
        String message = "VRUM VRUM!" + " " +
                "The engine is " + engine + ", " +
                "the seat set is " + seat + ", " +
                "the wheel set is " + wheelSet;
        Log.d(TAG, message);
    }
}
