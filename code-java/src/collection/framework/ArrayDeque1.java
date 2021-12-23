package collection.framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();

        deque.add("aqib");
        deque.addFirst("amit");
        deque.addLast("Ayaj");
        display(deque);

        deque.removeLast();
        deque.removeFirst();
        System.out.println("after remove: ");
        display(deque);
    }

    private static void display(Deque<String> deque) {
        for (String str : deque) {
            System.out.println(str);
        }
    }

}
