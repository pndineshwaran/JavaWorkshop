package com.techatpark.practices.basics.oops;

public class Bike implements Vehicle {

    String color;
    String brand;
    int speed;

    public Bike(String aColor, String aBrand) {
        color = aColor;
        this.brand = aBrand;
        this.speed = 0;
    }

    public void start(){
        System.out.println("Bike is starting...");
    }

    public void applyAcc(int speed){
        this.speed += speed;
        System.out.println("U r Going to fast " + this.speed);
    }

    public void stop() {
        System.out.println("Stop the Bike");
    }
}
