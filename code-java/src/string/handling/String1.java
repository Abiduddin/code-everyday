package string.handling;

import java.util.Locale;

public class String1 {
    public static void main(String[] args) {
        String str = "Hello world!";
        String world = new String("world!");
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', ' ' };
        String helloString = new String(helloArray);

        System.out.println(str.length());

        System.out.println(helloString.concat(world));
        System.out.println("Hello " + "java!");

        System.out.println("hello".charAt(1));

        System.out.println("exabyting".substring(3,6));

        System.out.println("exabyting".toUpperCase());
        System.out.println("exabyting".toLowerCase());


        // String immutable




    }
}
