package Stream.API;

import java.util.ArrayList;
import java.util.Optional;

public class Stream2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(70);
        myList.add(9);
        myList.add(18);
        myList.add(27);
        myList.add(7);

        Optional<Integer> prodObj = myList.stream().reduce((a, b) -> a * b);
        if (prodObj.isPresent())
            System.out.println("Product as optional: " + prodObj.get());

        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product as int: " + product);
    }
}
