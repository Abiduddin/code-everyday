package collection.framework;

import java.util.ArrayList;
import java.util.Spliterator;

public class Spliterator1 {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<Double>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // display all values
        Spliterator<Double> spliterator = vals.spliterator();
        while (spliterator.tryAdvance( (n) -> System.out.println(n)));
        System.out.println();

        // create new list of square roots
        spliterator = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<Double>();
        while (spliterator.tryAdvance( (n) -> sqrs.add(Math.sqrt(n))));

        //display all values of sqrs using forEachRemaining
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining( (n) -> System.out.println(n));
        System.out.println();
    }
}
