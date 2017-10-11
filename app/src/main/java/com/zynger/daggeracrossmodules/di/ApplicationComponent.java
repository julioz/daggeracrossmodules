package com.zynger.daggeracrossmodules.di;

import com.zynger.daggeracrossmodules.FleetApp;
import com.zynger.daggeracrossmodules.MainActivity;

import dagger.Component;

@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {
    void inject(FleetApp fleetApp);

    void inject(MainActivity mainActivity);
}
