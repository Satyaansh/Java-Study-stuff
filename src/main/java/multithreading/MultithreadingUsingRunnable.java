package src.main.java.multithreading;

//multithread class by implementing java.lang.Runnable
public class MultithreadingUsingRunnable implements Runnable {
    public void run() {
        try {
            System.out.println("Runnable interface based thread nummber " + Thread.currentThread().getId() + " is running.\n");
        }
        catch(Exception e) {
            System.out.println("Exception message:" + e.getMessage());
        }
    }
}
