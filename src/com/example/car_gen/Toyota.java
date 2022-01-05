package com.example.car_gen;

public class Toyota extends Car {
    private boolean greatGasMileage;

    Toyota(String color, int year, int speed, int maxSpeed, boolean isElectric, boolean greatGasMileage) {
        super(color, year, speed, maxSpeed, isElectric);
        this.greatGasMileage = greatGasMileage;
    }

    public boolean isGreatGasMileage() {
        return greatGasMileage;
    }

    public void setGreatGasMileage(boolean greatGasMileage) {
        this.greatGasMileage = greatGasMileage;
    }
}
