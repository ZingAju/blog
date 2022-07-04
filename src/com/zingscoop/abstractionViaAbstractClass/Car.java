package com.zingscoop.abstractionViaAbstractClass;

public abstract class Car {

    private final String carType;

    public String getCarType() {
        return carType;
    }

    // this constructor will be called from the implemenation classes by using super keyword
    public Car(String carType) {
        this.carType = carType;
    }

    abstract void startEngine();
    abstract void stopEngine();
    abstract void speedUp();
    abstract void speedDown();

}
