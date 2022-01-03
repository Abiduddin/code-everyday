package regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr2 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("test");
        Pattern pat1 = Pattern.compile("w+");
        Matcher mat = pat.matcher("test 1 2 3 test");
        Matcher mat1 = pat1.matcher("aaw aww awwwwa wwwwa waa");

        while (mat.find()) {
            System.out.println("test found at index: " + mat.start());
            System.out.println("match: " + mat.group());
        }
        System.out.println();

        while (mat1.find()) {
            System.out.println("Match: " + mat1.group());
        }

        System.out.println("modified sequence: " + mat1.replaceAll("A"));

        String strs[] =  pat1.split("aaw aww awwwwa wwwwa waa");
        for (String s : strs)
            System.out.println(s);
    }
}
