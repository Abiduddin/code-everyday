package collection.framework;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("C");
        ts.add("A");
        ts.add("F");
        ts.add("D");
        ts.add("C");
        ts.add("E");


        System.out.println(ts);
        System.out.println(ts.subSet("A",true,"E",false));
        System.out.println(ts.subSet("A","E"));
    }
}
