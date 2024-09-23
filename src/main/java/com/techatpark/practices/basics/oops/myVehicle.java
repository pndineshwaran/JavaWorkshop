package com.techatpark.practices.basics.oops;

public class myVehicle {
    public static void main(String[] args) {
        Car bmw = new Car("White", "BMW");
       Car maruthi = new Car("Black", "Maruthi");

        bmw.start();
        bmw.applyAcc(100);
        bmw.stop();

        maruthi.start();
        maruthi.stop();

        Bike yamaha = new Bike("Red", "Yamaha");

        yamaha.start();
        yamaha.applyAcc(154);
        yamaha.stop();
    }
}
