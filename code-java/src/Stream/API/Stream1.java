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
        myList.stream().sorted().forEach( n -> System.out.print(n + " "));

    }
}
