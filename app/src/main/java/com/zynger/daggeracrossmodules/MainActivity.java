package com.zynger.daggeracrossmodules;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zynger.collaborators.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car racingCar;

    public MainActivity() {
        FleetApp.getApplicationComponent().inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        racingCar.start();
    }
}
