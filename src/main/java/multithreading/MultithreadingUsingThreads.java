package src.main.java.multithreading;

//multithread class by extending java.lang.Thread
public class MultithreadingUsingThreads extends Thread {
    public void run() {
        try {
            System.out.println("Thread class based thread nummber " + Thread.currentThread().getId() + " is running.\n");
        }
        catch(Exception e) {
            System.out.println("Exception message:" + e.getMessage());
        }
    }
}

