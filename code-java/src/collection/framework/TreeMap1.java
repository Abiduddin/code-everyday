package collection.framework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

        treeMap.put("aaa", 333);
        treeMap.put("aaa zzz", 233);
        treeMap.put("aaa ppp", 433);
        treeMap.put("ggg", 555);
        treeMap.put("zaa", 999);
        treeMap.put("aoa", 444);
        treeMap.put("aav", 663);

        // get a  set of the entries
        Set<Map.Entry<String, Integer>> set = treeMap.entrySet();

        // display the set
        for(Map.Entry<String, Integer> mm : set) {
            System.out.println(mm.getKey() + " = " + mm.getValue());
        }

        // update value
        treeMap.put("aav", treeMap.get("aav")+1000);
        System.out.println("updated aav : " + treeMap.get("aav"));

    }
}
