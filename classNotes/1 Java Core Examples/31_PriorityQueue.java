/*
 * Topic: PriorityQueue
 * Core idea: a binary heap under the hood - the smallest element (by natural
 * order, or a supplied Comparator) always comes out first, in O(log n) per
 * insert/remove. It is NOT sorted internally end-to-end; only the head is
 * guaranteed to be the minimum. This is the standard tool for "top-K",
 * "K closest", and "running median"-style placement questions.
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        // Min-heap by default - smallest value has the highest priority
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // offer(item) | PriorityQueue | Params: item (Required) | Returns: boolean | O(log n)
        minHeap.offer(30);
        minHeap.offer(10);
        minHeap.offer(20);
        minHeap.offer(5);

        // peek() - look at the smallest without removing | Params: None | Returns: element | O(1)
        System.out.println(minHeap.peek());

        // poll() - remove and return the smallest | Params: None | Returns: element | O(log n)
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());   // comes out in ascending order: 5, 10, 20, 30
        }

        // Max-heap - supply a reversing Comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(java.util.List.of(30, 10, 20, 5));
        System.out.println(maxHeap.poll());   // 30 - largest first

        // Custom ordering with a Comparator - e.g. K closest points to the origin
        record Point(int x, int y) {}
        PriorityQueue<Point> byDistance = new PriorityQueue<>(
                (p1, p2) -> (p1.x() * p1.x() + p1.y() * p1.y()) - (p2.x() * p2.x() + p2.y() * p2.y())
        );
        byDistance.addAll(java.util.List.of(new Point(3, 3), new Point(1, 1), new Point(5, 5)));
        System.out.println(byDistance.poll());   // (1, 1) - closest to the origin

        // Top-K largest elements using a size-K min-heap
        int[] nums = {7, 2, 9, 4, 1, 8};
        int k = 3;
        PriorityQueue<Integer> topK = new PriorityQueue<>();
        for (int n : nums) {
            topK.offer(n);
            if (topK.size() > k) {
                topK.poll();   // evict the current smallest of the kept set
            }
        }
        System.out.println(topK);   // the 3 largest values, order not guaranteed
    }
}
