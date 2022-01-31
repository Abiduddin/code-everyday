package basic;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        System.out.println("array length: " + arr.length);
        System.out.println("array elements: ");
        Arrays.stream(arr).forEach(System.out::println);
    }
}
