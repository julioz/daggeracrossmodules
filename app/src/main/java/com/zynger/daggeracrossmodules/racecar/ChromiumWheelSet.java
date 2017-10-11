package com.zynger.daggeracrossmodules.racecar;

import com.zynger.collaborators.WheelSet;

import javax.inject.Inject;

public class ChromiumWheelSet implements WheelSet {

    @Inject
    public ChromiumWheelSet() {
    }

    @Override
    public String toString() {
        return "shiny chromium wheels";
    }
}
