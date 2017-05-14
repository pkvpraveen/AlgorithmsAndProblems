package problems;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class SortStackTest {

    @Test
    public void shouldSortStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        Stack<Integer> sorted = new SortStack().sort(stack);

        int temp = sorted.pop();
        while (!stack.isEmpty()) {
            Integer pop = sorted.pop();
            assertTrue(temp > pop);
            temp = pop;
        }
    }
}