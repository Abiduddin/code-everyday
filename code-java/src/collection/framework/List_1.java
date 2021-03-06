package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List_1 {

    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        list.add(7);
        list.add(5);
        list.add(13);
        list.add(17);
        list.add(3);
        printList();

        // element update
        list.set(2, 55);
        printList();

        // element delete
        list.remove(2);
        printList();

        list.remove(Integer.valueOf(13));
        printList();

        list.add(3);
        list.remove(Integer.valueOf(3));
        printList();

        // sort
        Collections.sort(list);
        printList();

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        printList();

        Collections.sort(list, (t1, t2) -> t1 - t2);
        printList();

        List aa = new ArrayList();
        aa.add(1);
        aa.add("dfdfdf");
        aa.add(1.33);

        for (var a:aa)
            System.out.println(a);

    }

    private static void printList() {
        list.forEach((x) -> {
            System.out.print(x + " ");
        });
        System.out.println("\n-------------------");
    }
}

