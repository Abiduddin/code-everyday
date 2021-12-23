package collection.framework;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<Integer>();
        set.add(11);
        set.add(134);
        set.add(2);
        set.add(11);
        display(set);

    }

    private static void display(Set<?> set) {
        for (var str : set) {
            System.out.println(str);
        }
    }
}
