package collection.framework;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        System.out.println("Contents: " + ll);

        ll.remove("F");
        ll.remove(2);
        System.out.println("after deletion: " + ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println("after deletion first and last: " + ll);

        ll.set(2, "set");
        System.out.println("updated: " + ll);

        ll.add("E");
        ll.add("E");
        System.out.println("duplicate: " + ll);

    }
}
