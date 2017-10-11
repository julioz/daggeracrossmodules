package com.zynger.daggeracrossmodules;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zynger.collaborators.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = new Car(null, null, null);
        car.start();
    }
}
