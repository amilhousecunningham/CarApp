package com.example.car_gen;

public class Honda extends Car{

    private boolean isTurboCharged;

    Honda(String color, int year, int speed, int maxSpeed, boolean isElectric, boolean isTurboCharged) {
        super(color, year, speed, maxSpeed, isElectric);
        this.isTurboCharged = isTurboCharged;
    }

    public boolean isTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        isTurboCharged = turboCharged;
    }
}
