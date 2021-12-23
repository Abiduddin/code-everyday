package collection.framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("kazol", 333);
        hashMap.put("farhan", 444);
        hashMap.put("shanto", 663);
        hashMap.put("abrar", 555);

        // get a  set of the entries
        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

        // display the set
        for(Map.Entry<String, Integer> mm : set) {
            System.out.println(mm.getKey() + " = " + mm.getValue());
        }

        // update value
        hashMap.put("shanto", hashMap.get("shanto")+1000);
        System.out.println("updated shanto : " + hashMap.get("shanto"));

    }
}
