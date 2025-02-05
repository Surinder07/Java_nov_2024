package feb4;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        //add element to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(320);
        queue.offer(3120);
        queue.offer(3320);


        // see the element without removing it
        System.out.println(queue.peek());

        // remove the first element
        Integer poll = queue.poll();
        System.out.println(poll);

        System.out.println(queue);


        // for loop

        for (Integer  q: queue) {
            System.out.println(q);
        }

    }
}
