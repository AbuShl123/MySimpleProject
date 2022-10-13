package linkedLitsPractice;

import java.util.Arrays;
import java.util.LinkedList;

public class SimpleMethods {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("a", "b", "c", "d"));

        System.out.println(linkedList);

        System.out.println(linkedList.get(0));

        System.out.println(linkedList.peek()); // what
        linkedList.poll();
        System.out.println(linkedList);
        System.out.println(linkedList.peek());

        System.out.println(linkedList.remove());
        System.out.println(linkedList);

        // peek() == get()
        // peek() method gets the leftmost element
        // poll() == remove()
        // poll() method removes the rightmost element as well as remove() method
    }
}
