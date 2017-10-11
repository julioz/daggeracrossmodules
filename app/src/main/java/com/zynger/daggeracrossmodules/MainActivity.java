package com.zynger.daggeracrossmodules;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zynger.collaborators.Car;
import com.zynger.daggeracrossmodules.racecar.ChromiumWheelSet;
import com.zynger.daggeracrossmodules.racecar.LeatherSeat;
import com.zynger.daggeracrossmodules.racecar.RacingEngine;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject RacingEngine racingEngine;
    @Inject LeatherSeat leatherSeat;
    @Inject ChromiumWheelSet chromiumWheelSet;

    public MainActivity() {
        FleetApp.getApplicationComponent().inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = new Car(racingEngine, leatherSeat, chromiumWheelSet);
        car.start();
    }
}
