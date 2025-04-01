package src.main.java.extensionAndImplementation;

public class Fish extends Animal implements Swimmable {
    @Override
    void eat() {
        System.out.println("fish be eating");
    }

    @Override
    public void swim() {
        System.out.println("Also be swimming");
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.eat();
        fish.swim();
    }
}
