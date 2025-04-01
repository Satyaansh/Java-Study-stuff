package src.main.java.extensionAndImplementation;

public class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("The guitar be shredding");
    }

    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.play();
    }
}


