package com.zynger.collaborators.di;

import com.zynger.collaborators.EnginePump;
import com.zynger.collaborators.GasPump;
import com.zynger.collaborators.LiquidPump;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class EngineModule {

    public static final String GAS_PUMP = "gas_pump";
    public static final String LIQUID_PUMP = "liquid_pump";

    @Named(GAS_PUMP)
    @Provides
    EnginePump provideGasPump() {
        return new GasPump();
    }

    @Named(LIQUID_PUMP)
    @Provides
    EnginePump provideLiquidPump() {
        return new LiquidPump();
    }
}
