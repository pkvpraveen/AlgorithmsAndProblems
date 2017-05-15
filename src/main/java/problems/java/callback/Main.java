package problems.java.callback;

public class Main {
    public static void main(String[] args) {
        Runnable callback = () -> System.out.println("Sub thread done");
        Thread myThread = new Thread(new MyThread(callback));


        myThread.start();
        System.out.println("Main thread done");
    }
}
