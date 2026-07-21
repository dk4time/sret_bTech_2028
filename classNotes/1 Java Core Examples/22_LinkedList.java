/*
 * Topic: LinkedList
 * Core idea: a doubly-linked list under the hood - O(1) insertion/removal at
 * either end, but O(n) random access since there's no index to jump to. It
 * also implements Deque, so it can be used as a stack or queue directly.
 * Reach for this when you insert/remove at the ends far more than you
 * random-access by index.
 */

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>(List.of(10, 20, 30));
        System.out.println(numbers);

        // addFirst() / addLast() | LinkedList | Params: item (Required) | Returns: void | O(1)
        numbers.addFirst(5);
        numbers.addLast(40);
        System.out.println(numbers);

        // removeFirst() / removeLast() | LinkedList | Params: None | Returns: element | O(1)
        int first = numbers.removeFirst();
        int last = numbers.removeLast();
        System.out.println(first + " " + last + " " + numbers);

        // get(index) - still supported, but O(n): it walks the chain of nodes
        // LinkedList | Params: index (Required) | Returns: element | O(n)
        System.out.println(numbers.get(1));

        // peekFirst() / peekLast() - look without removing | Params: None | Returns: element | O(1)
        System.out.println(numbers.peekFirst() + " " + numbers.peekLast());

        // Using it as a stack (LIFO) via push()/pop() - both O(1)
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());   // 3 - last in, first out
        System.out.println(stack);

        // Using it as a queue (FIFO) via offer()/poll() - both O(1)
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.poll());   // 1 - first in, first out
        System.out.println(queue);
    }
}
