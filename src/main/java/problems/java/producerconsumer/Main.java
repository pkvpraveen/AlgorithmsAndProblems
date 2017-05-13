package problems.java.producerconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Main {

    List<Integer> pubSub() {
        List<Integer> output = new ArrayList<>();
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread producer = new Thread(new Producer(queue));

        Thread consumer1 = new Thread(new Consumer(queue, "consumer 1", output));
        Thread consumer2 = new Thread(new Consumer(queue, "consumer 2", output));

        producer.start();
        consumer1.start();
        consumer2.start();

        while (true) {
            if (!consumer1.isAlive() && !consumer2.isAlive()) {
                System.out.println("output = " + output);
                return output;
            }
        }
    }

    /*
      Produced 0
      Produced 1
      Produced 2
      Produced 3
      Produced 4
      Produced 5
      Produced 6
      Produced 7
      Produced 8
      Produced 9
      consumer 2 consumed => 0
      consumer 2 consumed => 1
      consumer 2 consumed => 2
      consumer 2 consumed => 3
      consumer 2 consumed => 4
      consumer 2 consumed => 5
      consumer 2 consumed => 6
      consumer 2 consumed => 7
      consumer 2 consumed => 8
      consumer 2 consumed => 9
      consumer 2 exiting
      consumer 1 exiting
      output = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
     */
}
