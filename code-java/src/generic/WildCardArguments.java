package generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardArguments {
    public static void main(String[] args) {

//      List<Object> objLst = new ArrayList<String>();  // Object super class

        List<Object> objLst = new ArrayList<Object>();
        objLst.add(33);
        objLst.add(77);
        print(objLst);

        List<String> strLst = new ArrayList<String>();
        strLst.add("one");
        strLst.add("two");
        print(strLst);
    }

    public static void print(List<?> lst)
    {
        for(Object o : lst){
            System.out.println(o);
        }
    }
}
