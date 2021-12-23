package collection.framework;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        
        vector.add(11);
        vector.add(5);
        vector.addElement(9);
        vector.addElement(7);
        
        display(vector);

        System.out.println("size: "+ vector.size());
        System.out.println("capacity: "+ vector.capacity());
        System.out.println("first element: "+ vector.firstElement());
        System.out.println("last element: "+ vector.lastElement());
        System.out.println("vector contain 99: "+ vector.contains(990));
    }

    private static void display(Vector<Integer> vector) {
        for ( int i : vector)
            System.out.print(i+" ");
        System.out.println();
    }
}
