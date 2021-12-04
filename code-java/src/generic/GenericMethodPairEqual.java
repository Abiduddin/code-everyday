package generic;

import java.util.HashMap;
import java.util.Map;

public class GenericMethodPairEqual {
    public static void main(String[] args) {
        Map<Integer, String> p1 = new HashMap<Integer, String>();
        p1.put(1, "one");
        p1.put(2, "two");
        Map<Integer, String> p2 = new HashMap<Integer, String>();
        p2.put(1, "one");
        p2.put(2, "two");

        System.out.println(compare(p1, p2));
        System.out.println(compareStream(p1, p2));
    }

    public static <K, V> boolean compare(Map<K, V> p1, Map<K, V> p2) {
        return p1.equals(p2);
    }

    public static <K, V> boolean compareStream(Map<K, V> p1, Map<K, V> p2) {
        if (p1.size() != p2.size())
            return false;
        return p1.entrySet().stream()
                .allMatch(e->e.getValue().equals(p2.get(e.getKey())));
    }

}
