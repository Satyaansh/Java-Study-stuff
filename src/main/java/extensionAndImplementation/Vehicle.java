package src.main.java.extensionAndImplementation;

public abstract class Vehicle {

    public void startEngine() {
        System.out.println("The engine has started");
    }

    abstract void drive();
}

class Car extends Vehicle {

    @Override
    void drive() {
        System.out.println("Car is driving");
    }
}

class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.startEngine();;
        car.drive();
    }
}
