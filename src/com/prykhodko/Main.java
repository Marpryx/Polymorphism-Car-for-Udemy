package com.prykhodko;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;


    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;

    }

    ////////////Getters//////////////

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine(){
        System.out.println("Car class. Engine was started");
    }

    public void accelerate(){
        System.out.println("Car class. The car accelerates");

    }

    public void brake(){
        System.out.println("Car class. The brake was activated");

    }
}

class Nissan extends Car{

    public Nissan(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Nissan class. Engine was started");
    }

    @Override
    public void accelerate() {
        System.out.println("Nissan class. The car accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Nissan class. The brake was activated");
    }
}


public class Main {

    public static void main(String[] args) {
        Car car = new Car("Mazda", 8);
        car.accelerate();
        car.brake();
        car.startEngine();

        Nissan newCar = new Nissan("Rougue", 8);
        newCar.accelerate();
        newCar.brake();
        newCar.startEngine();
    }
}
