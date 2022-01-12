package stream.api;

import java.util.ArrayList;

public class ParallelStream {
    public static void main(String[] args) {

        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(17.0);
        myList.add(71.0);
        myList.add(717.0);

        Double productOfSqrtRoots = myList.parallelStream().reduce(
                1.0,
                (a, b) -> a * Math.sqrt(b),
                (a, b) -> a * b
        );

        System.out.println("Product of square roots by parallel: " + productOfSqrtRoots);

//        double[] array = myList.stream().mapToDouble(i ->i).toArray();
//        Double[] array = myList.stream().toArray(n->new Double[n]);
        Double[] array = myList.toArray(new Double[0]);

        productOfSqrtRoots = 1.0;
        for (Double aDouble : array) {
            productOfSqrtRoots = productOfSqrtRoots * Math.sqrt(aDouble);
        }
        System.out.println("Product of square roots: " + productOfSqrtRoots);

    }
}
