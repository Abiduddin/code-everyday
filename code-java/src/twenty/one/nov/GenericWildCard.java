package twenty.one.nov;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCard {
    public static void main(String[] args) {
        List<Object> objLst = new ArrayList<Object>();
        objLst.add(33);
        print(objLst);

        List<String> strLst = new ArrayList<String>();
        strLst.add("one");
        print(strLst);
    }

    public static void print(List<?> lst)
    {
        for(Object o : lst){
            System.out.println(o);
        }
    }
}
