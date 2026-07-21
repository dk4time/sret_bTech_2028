/*
 * Topic: Stack
 * Core idea: LIFO (last in, first out) via push()/pop()/peek(). java.util.Stack
 * is a legacy class - it extends Vector and is needlessly synchronized for
 * single-threaded code. Oracle's own docs recommend ArrayDeque instead for
 * real stack use today. This file still covers Stack directly, since it's a
 * real class students will see in placement tests and older codebases.
 */

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // push(item) | Stack | Params: item (Required) | Returns: item | O(1)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        // peek() - look at the top without removing | Params: None | Returns: element | O(1)
        System.out.println(stack.peek());

        // pop() - remove and return the top | Params: None | Returns: element | O(1)
        System.out.println(stack.pop());
        System.out.println(stack);

        // empty() | Params: None | Returns: boolean | O(1)
        System.out.println(stack.empty());

        // search(item) - 1-based distance from the top, or -1 if absent
        // Params: item (Required) | Returns: int | O(n)
        System.out.println(stack.search(10));

        // pop() on an empty stack throws - always check empty() first
        Stack<Integer> emptyStack = new Stack<>();
        try {
            emptyStack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Cannot pop from an empty stack");
        }

        // Classic use: checking balanced parentheses
        System.out.println(isBalanced("(a(b)c)"));
        System.out.println(isBalanced("(a(bc)"));
    }

    static boolean isBalanced(String text) {
        Stack<Character> brackets = new Stack<>();
        for (char ch : text.toCharArray()) {
            if (ch == '(') {
                brackets.push(ch);
            } else if (ch == ')') {
                if (brackets.isEmpty()) return false;
                brackets.pop();
            }
        }
        return brackets.isEmpty();
    }
}
