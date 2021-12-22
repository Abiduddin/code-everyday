package collection.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("K");
        list.add("L");
        list.add("A");
        list.add("O");
        list.add("P");

        // display all content
        Iterator<String> itr  = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() +" ");
        }
        System.out.println();

        // modify objects being iterated
        ListIterator<String > litr = list.listIterator();
        while (litr.hasNext()){
            String element = litr.next();
            litr.set(element + "+");
        }

        // display all modified content
        itr  = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }
}
