package com.zynger.daggeracrossmodules;

import android.app.Application;
import android.content.Context;

import com.zynger.daggeracrossmodules.di.ApplicationComponent;
import com.zynger.daggeracrossmodules.di.ApplicationModule;
import com.zynger.daggeracrossmodules.di.DaggerApplicationComponent;

public class FleetApp extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        this.applicationComponent = buildApplicationComponent();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent.inject(this);
    }

    private ApplicationComponent buildApplicationComponent() {
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
