package problems;

import java.util.Stack;

class SortStack {

    Stack<Integer> sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sort(stack);
            sortInsert(stack, temp);
        }
        return stack;
    }

    private void sortInsert(Stack<Integer> stack, int elememnt) {
        if (stack.isEmpty() || stack.peek() < elememnt) {
            stack.push(elememnt);
        } else {
            int temp = stack.pop();
            sortInsert(stack, elememnt);
            stack.push(temp);
        }
    }
}
