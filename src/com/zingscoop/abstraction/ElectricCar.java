package com.zingscoop.abstraction;

public class ElectricCar implements Car{

    private String carType;

    public ElectricCar(String carType) {
        this.carType = carType;
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

    @Override
    public String carType() {
        return this.carType;
    }
    
}
