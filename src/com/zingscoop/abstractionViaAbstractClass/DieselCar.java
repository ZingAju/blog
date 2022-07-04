package com.zingscoop.abstractionViaAbstractClass;

public class DieselCar extends Car {

    public DieselCar(String carType) {
        super(carType);
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

    
}
