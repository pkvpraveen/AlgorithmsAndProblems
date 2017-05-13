package problems.java.producerconsumer;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;
    private String name;
    private List<Integer> output;

    Consumer(BlockingQueue<Integer> queue, String name, List<Integer> output) {
        this.queue = queue;
        this.name = name;
        this.output = output;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer take = queue.poll(10, TimeUnit.MILLISECONDS);
                if (take == null || take == -1) {
                    break;
                }
                output.add(take);
                System.out.println(name + " consumed => " + take);
            }
            System.out.println(name + " exiting");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
