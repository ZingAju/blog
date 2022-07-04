package com.zingscoop.abstractionViaAbstractClass;

public class ElectricCar extends Car {

    public ElectricCar(String carType) {
        super(carType);
    }

    @Override
    public void startEngine() {
        System.out.println("Start the electric car");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the electric car");
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up the Electric Car");
    }

    @Override
    public void speedDown() {
        System.out.println("Speed down the Electric Car");
    }
    
}
