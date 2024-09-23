package com.techatpark.practices.basics.oops;

public class Car implements Vehicle {

    String color;
    String brand;
    int speed;

    public Car(String aColor, String aBrand) {

        this.brand = aBrand;
        this.speed = 0;
    }
    public void start(){

        System.out.println("Car started " +speed);
    }

    public void applyAcc(int speed) {
        this.speed += speed;
        System.out.println("Speed: " + this.speed);
    }

    public void stop() {
    }
}



