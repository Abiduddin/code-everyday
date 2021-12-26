package collection.framework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<String, Double> hashtable = new Hashtable<String, Double>();
        String str;

        hashtable.put("Aqib", 100000.32);
        hashtable.put("Shanto", 200000.29);
        hashtable.put("Tuhin", 150000.92);
        hashtable.put("Noyon", 250000.63);

        Enumeration<String> names = hashtable.keys();
        while (names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println("Name: " + str + " Salary: " + hashtable.get(str));
        }

        Set<String> set = hashtable.keySet();

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + " : " + hashtable.get(str));
        }
    }
}
