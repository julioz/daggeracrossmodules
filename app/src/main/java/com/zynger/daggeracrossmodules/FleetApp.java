package com.zynger.daggeracrossmodules;

import android.app.Application;
import android.content.Context;

import com.zynger.daggeracrossmodules.di.ApplicationComponent;
import com.zynger.daggeracrossmodules.di.ApplicationModule;
import com.zynger.daggeracrossmodules.di.DaggerApplicationComponent;

public class FleetApp extends Application {

    private static FleetApp instance;
    private ApplicationComponent applicationComponent;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        this.applicationComponent = buildApplicationComponent();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        applicationComponent.inject(this);
    }

    private ApplicationComponent buildApplicationComponent() {
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public static ApplicationComponent getApplicationComponent() {
        if (instance == null || instance.applicationComponent == null) {
            throw new IllegalStateException(
                    "Cannot access the app graph before the application has been created");
        }
        return instance.applicationComponent;
    }
}
