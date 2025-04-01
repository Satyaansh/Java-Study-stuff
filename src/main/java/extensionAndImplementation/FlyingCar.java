package src.main.java.extensionAndImplementation;

public class FlyingCar extends Car implements Flyable{

    @Override
    public void fly() {
        System.out.println("Car is flying damn");
    }

    public static void main(String[] args) {
        FlyingCar fc = new FlyingCar();
        fc.drive();
        fc.fly();
    }


}
