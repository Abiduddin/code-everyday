package regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr1 {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches();

        System.out.println("Testing Java against Java");

        if (found)
            System.out.println("Matches");
        else
            System.out.println("No Match");

        System.out.println();

        System.out.println("Testing Java against Java SE");
        mat = pat.matcher("Java SE");

        found = mat.matches();

        if (found)
            System.out.println("Matches");
        else
            System.out.println("No Match");


        System.out.println("Testing find Java against Java SE");
        found = mat.find();

        if (found)
            System.out.println("subsequence found");
        else
            System.out.println("No Match");
    }
}
