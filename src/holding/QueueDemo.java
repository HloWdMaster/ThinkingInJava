package holding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Create by leonardo on 2018/11/21
 */
public class QueueDemo {

    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.offer(r.nextInt(i + 10)));

        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}
