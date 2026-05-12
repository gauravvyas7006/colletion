import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i  > j) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Queue<Integer> pq = new PriorityQueue<>(com);

        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(80);

        System.out.println(pq);
    }
}