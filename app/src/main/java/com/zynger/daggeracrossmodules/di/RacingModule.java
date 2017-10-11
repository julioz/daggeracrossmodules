package com.zynger.daggeracrossmodules.di;

import com.zynger.collaborators.Car;
import com.zynger.collaborators.EnginePump;
import com.zynger.collaborators.di.EngineModule;
import com.zynger.daggeracrossmodules.racecar.ChromiumWheelSet;
import com.zynger.daggeracrossmodules.racecar.LeatherSeat;
import com.zynger.daggeracrossmodules.racecar.RacingEngine;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class RacingModule {

    @Provides
    RacingEngine provideRacingEngine(@Named(EngineModule.GAS_PUMP) EnginePump enginePump) {
        return new RacingEngine(enginePump);
    }

    @Provides
    LeatherSeat provideRacingSeats() {
        return new LeatherSeat();
    }

    @Provides
    ChromiumWheelSet provideRacingWheels() {
        return new ChromiumWheelSet();
    }

    @Provides
    Car provideRacingCar(RacingEngine engine, LeatherSeat seats, ChromiumWheelSet wheels) {
        return new Car(engine, seats, wheels);
    }
}
