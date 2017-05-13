package problems.java.producerconsumer;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void shouldConsumeAndCreateListInOrder() {
        Main main = new Main();
        List<Integer> integers = main.pubSub();
        for (int i = 0; i < 10; i++) {
            assertEquals(Optional.ofNullable(i), Optional.ofNullable(integers.get(i)));

        }
    }
}