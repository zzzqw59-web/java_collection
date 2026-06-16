package deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {
    static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("queue = " + queue);

        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("poll = " + queue.poll());
        System.out.println("poll = " + queue.poll());
        System.out.println("poll = " + queue.poll());
        System.out.println("queue = " + queue);
    }
}
