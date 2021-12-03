package twenty.one.dec;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Map_1 {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"kaka");
        map.put(101,"papa");
        map.put(102,"tata");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
