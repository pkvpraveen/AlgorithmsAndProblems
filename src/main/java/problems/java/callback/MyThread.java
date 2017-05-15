package problems.java.callback;

public class MyThread implements Runnable {
    private Runnable callback;

    MyThread(Runnable callback) {
        this.callback = callback;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        callback.run();
    }
}
