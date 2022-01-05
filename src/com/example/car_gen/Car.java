package com.example.car_gen;

//Instance Fields
public class Car {
   private String color;
   private int year;
   private int speed = 0;
   private int maxSpeed;
   private boolean isElectric;

    //    Constructor
    public Car(String color, int year, int speed, int maxSpeed, boolean isElectric) {
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

//    Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

//    Methods
    public void accelerateSpeed(){
      if(speed < maxSpeed) {
         speed = speed + 5;
      } else {
          System.err.println("Error! The car is at it's maximum speed!");
      }
     }

    public void decelerateSpeed(){
        if(speed > 5) {
            speed = speed - 5;
        } else {
            System.err.println("Error! The car is at it's minimum speed!");
        }
    }

    public void convertToElectric(){
        if(isElectric) {
            System.out.println("The value is already true!");
        } else {
            System.err.println(true);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", isElectric=" + isElectric +
                '}';
    }

}
