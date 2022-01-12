package stream.api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(1.0);
        myList.add(2.0);
        myList.add(3.0);

        Stream<Double> sqrtRootStrm = myList.stream().map((a) -> Math.sqrt(a));
        System.out.println("product square: " + sqrtRootStrm);

        double productOfSqrtRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);
        System.out.println("product of square root is: " + productOfSqrtRoots);
    }
}
