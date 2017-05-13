package problems.java.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<Integer> queue;

    Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                queue.put(i);
                System.out.println("Produced " + i);
            }
            queue.put(-1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
