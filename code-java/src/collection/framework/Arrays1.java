package collection.framework;

import java.util.Arrays;
import java.util.List;

public class Arrays1 {
    public static void main(String[] args) {
        int array[] = {-11, 2, 33, -4, 50, 7};

        display(array);
        System.out.println("sort");
        Arrays.sort(array);
        display(array);

        System.out.println("fill");
        Arrays.fill(array, 3, 5, 9);
        display(array);

        System.out.println("sort");
        Arrays.sort(array);
        display(array);

        System.out.println("location of -4: " + Arrays.binarySearch(array, -4));

        List<Integer> ls = Arrays.asList(1,3,4,5,56);

        ls.forEach(System.out::println);

    }

    private static void display(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
