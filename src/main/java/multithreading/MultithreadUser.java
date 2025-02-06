package src.main.java.multithreading;

//main class
public class MultithreadUser {
    public static void main(String[] args) {

        MultithreadUser user = new MultithreadUser();

        //running Thread class based multithreading 5 times
        int n1 = 5;
        user.runThreadsUsingThreadClass(n1);

        //running Runnable Interface based multithreading 8 times
        int n2 = 8;
        user.runThreadsUsingRunnableInterface(n2);

    }
    public void runThreadsUsingThreadClass(int n) {

        for(int i = 0; i < n; i++) {
            MultithreadingUsingThreads m = new MultithreadingUsingThreads();
            m.start();
        }

    }
    public void runThreadsUsingRunnableInterface(int n) {

        for(int i = 0; i < n; i++) {
            Thread m = new Thread(new MultithreadingUsingRunnable());
            m.start();
        }
    }

    /*
    * Thread Class vs Runnable Interface
        1. If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.
        2. We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.
        3. Using runnable will give you an object that can be shared amongst multiple threads.
    * */

}
