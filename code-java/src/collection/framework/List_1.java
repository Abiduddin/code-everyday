package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_1 {

    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {


        list.add(7);
        list.add(5);
        list.add(13);
        list.add(17);
        list.add(3);

        Collections.sort(list);
        printList();

        list.set(2,55);
        printList();

        list.remove(2);
        printList();

        list.remove(new Integer(13));
        printList();

        list.add(3);
        list.remove(new Integer(3));
        printList();



    }

    private static void printList() {
        list.forEach((x) -> {
            System.out.println(x);
        });
        System.out.println("-------------------");
    }
}

