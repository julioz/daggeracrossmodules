package com.zynger.daggeracrossmodules;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zynger.collaborators.Car;
import com.zynger.daggeracrossmodules.racecar.ChromiumWheelSet;
import com.zynger.daggeracrossmodules.racecar.LeatherSeat;
import com.zynger.daggeracrossmodules.racecar.RacingEngine;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = new Car(new RacingEngine(), new LeatherSeat(), new ChromiumWheelSet());
        car.start();
    }
}
