package se.iths;
// Java program to ReverseString using StringBuilder
import java.lang.*;


public class TextProcessor {

    public static void main(String[] args) {
        System.out.println(upperCase("HejHaLlÅ"));
        System.out.println(lowerCase("HejHaLlÅ"));
        System.out.println(reverse("HejHaLlÅ"));

    }
    public static String upperCase(String a) {

        return a.toUpperCase();

    }

    public static String lowerCase(String a) {

        return a.toLowerCase();

    }

    public static String reverse(String a) {

        StringBuilder input1 = new StringBuilder();
        // append a string into StringBuilder input1
        input1.append(a);
        // print and reverse StringBuilder input1
        return input1.reverse().toString();

    }


}
