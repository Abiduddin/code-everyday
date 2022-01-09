package Stream.API;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(73);
        myList.add(23);
        myList.add(90);
        myList.add(25);
        myList.add(15);

        System.out.println("List of Integer: " + myList);

        Stream<Integer> myStream = myList.stream();

        System.out.println("min value: " + myStream.min(Integer::compare).get());

        myStream = myList.stream();
        System.out.println("max value: " + myStream.max(Integer::compare).get());

        System.out.println("sorted list");
        myList.stream().sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> odds = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.println("Odd values: ");
        odds.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        odds = myList.stream()
                .filter(n -> n % 2 == 1)
                .filter(n -> n > 23);
        System.out.println("odds number and greater than 23: ");
        odds.forEach(n -> System.out.print(n + " "));

        System.out.println("Original list: "+ myList);



    }
}
