package com.zynger.daggeracrossmodules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zynger.collaborators.Collaborator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Collaborator collaborator = new Collaborator();
    }
}
