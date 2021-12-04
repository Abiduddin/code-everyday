package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_1 {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(5);
        list.add(13);
        list.add(17);
        list.add(3);

        Collections.sort(list);

        list.forEach((x) -> {
            System.out.println(x);
        });
    }
}

