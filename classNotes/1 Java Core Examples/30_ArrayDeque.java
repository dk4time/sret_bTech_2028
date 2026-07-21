/*
 * Topic: ArrayDeque
 * Core idea: a resizable array supporting O(1) insertion/removal at BOTH
 * ends. It implements both the Stack-like and Queue-like interfaces, and is
 * the class Oracle actually recommends over java.util.Stack and LinkedList
 * for those roles - faster, no synchronization overhead.
 */

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // addFirst() / addLast() | ArrayDeque | Params: item (Required) | Returns: void | O(1)
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        System.out.println(deque);

        // Using it as a STACK - push()/pop() operate on the front
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());   // 3 - last in, first out
        System.out.println(stack);

        // Using it as a QUEUE - offer() adds to the back, poll() removes from the front
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.poll());   // 1 - first in, first out
        System.out.println(queue);

        // peekFirst() / peekLast() - look without removing | Params: None | Returns: element | O(1)
        System.out.println(deque.peekFirst() + " " + deque.peekLast());

        // Classic sliding-window-maximum pattern uses a Deque of INDICES to
        // maintain a monotonic decreasing sequence - a very common placement question
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        ArrayDeque<Integer> window = new ArrayDeque<>();   // stores indices
        for (int i = 0; i < nums.length; i++) {
            while (!window.isEmpty() && window.peekFirst() <= i - k) {
                window.pollFirst();
            }
            while (!window.isEmpty() && nums[window.peekLast()] < nums[i]) {
                window.pollLast();
            }
            window.addLast(i);
            if (i >= k - 1) {
                System.out.println(nums[window.peekFirst()]);
            }
        }
    }
}
