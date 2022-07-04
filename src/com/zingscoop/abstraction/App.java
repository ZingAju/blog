package com.zingscoop.abstraction;
public class App {
    public static void main(String[] args) throws Exception {

        Car dieselCar = new DieselCar("DieselCar");
        dieselCar.startEngine();
        dieselCar.speedUp();
        dieselCar.speedDown();
        dieselCar.stopEngine();

        System.out.println("========= ZingScoop ======");


        Car electricCar = new ElectricCar("ElectricCar");
        electricCar.startEngine();
        electricCar.speedUp();
        electricCar.speedDown();
        electricCar.stopEngine();
        
    }
}
