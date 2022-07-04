package com.zingscoop.abstraction;

public class DieselCar implements Car {

    private String carType;

    public DieselCar(String carType) {
        this.carType = carType;
    }

    @Override
    public void startEngine() {
        System.out.println("Start the Diesel car ");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the Diesel car ");
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up the Diesel Car");
    }

    @Override
    public void speedDown() {
        System.out.println("Speed down the Diesel Car");
    }

    @Override
    public String carType() {
        return this.carType;
    }
    
}
