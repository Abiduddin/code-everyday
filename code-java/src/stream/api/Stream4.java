package stream.api;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Stream4 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();

        Spliterator<String> splitItr = myStream.spliterator();

        while (splitItr.tryAdvance((n) -> System.out.println(n))) ;

        myStream = myList.stream();
        splitItr = myStream.spliterator().trySplit();

        if (splitItr != null) {
            System.out.println("Output from split: ");
            splitItr.forEachRemaining((n) -> System.out.println(n));
        }
    }
}
