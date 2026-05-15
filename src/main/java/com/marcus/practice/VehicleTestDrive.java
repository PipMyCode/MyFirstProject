package com.marcus.practice;

public class VehicleTestDrive {
    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();


        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle v : vehicles) {
            v.go();
        }
    }
}
