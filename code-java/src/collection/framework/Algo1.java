package collection.framework;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Algo1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(-44);
        list.add(-14);
        list.add(4);
        list.add(44);
        list.add(-411);
        list.add(4444);

        // sort reverse order
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(list, r);

        System.out.println("list sorted reversed order");
        for ( int i : list)
            System.out.print(i + " ");
        System.out.println();

        // shuffle
        Collections.shuffle(list);
        System.out.println("list shuffled");
        for ( int i : list)
            System.out.print(i + " ");
        System.out.println();

        System.out.println("max value: "+ Collections.max(list));
        System.out.println("min value: "+ Collections.min(list));
    }
}
