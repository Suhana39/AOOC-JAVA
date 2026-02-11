import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class StackQueue {

    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack Pop:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("\nQueue Remove:");
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
