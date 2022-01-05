package com.example.car_gen;

public class Main {


    public static void main(String[] args) {

        Honda civic = new Honda("green", 2002, 120, 120, false, true);
        Toyota supra = new Toyota("black", 1992, 130, 130, false, false);
        Lexus rx350 = new Lexus("red", 2022, 70, 150, true, true);
        System.out.println(civic.getColor());
        System.out.println(supra.getYear());
        System.out.println(rx350.isHasLeatherSeats());
        System.out.println(supra.getSpeed());
        System.out.println(supra.getMaxSpeed());
        supra.setColor("pink");
        System.out.println(supra.getColor());

        supra.accelerateSpeed();
        System.out.println("Supra's Speed: " + supra.getSpeed() + " MPH");

        civic.decelerateSpeed();
        System.out.println("Civic's Speed (decrease): " + civic.getSpeed() + " MPH");

        rx350.convertToElectric();
        System.out.println(rx350.isElectric());

        civic.convertToElectric();
        System.out.println(civic.isElectric());

        System.out.println(supra);

















    }
}





