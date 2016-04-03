package com.forte.demo.javatutorialdemos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {

    // toUpperCase(), trim(), split(), indexOf, contains(), replace(), replaceAll(), startsWith(), equalsIgnoreCase()

    public static void regexExample() {

        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        boolean b = m.matches();
    }

    public static void simpleStrings() {

            String palindrome = "Dot saw I was Tod";
            int len = palindrome.length();
            char[] tempCharArray = new char[len];
            char[] charArray = new char[len];

            // put original string in an
            // array of chars
            for (int i = 0; i < len; i++) {
                tempCharArray[i] =
                        palindrome.charAt(i);
            }

        // Strings are IMMUTABLE so you cannot do somthing like
        // palindrome.charAt(2) = '6';

            // reverse array of chars
            for (int j = 0; j < len; j++) {
                charArray[j] =
                        tempCharArray[len - 1 - j];
            }

            String reversePalindrome =
                    new String(charArray);
            System.out.println(reversePalindrome);
    }

    public static void formattingStrings() {

        String fs;
        fs = String.format("The value of the float " +
                        "variable is %f, while " +
                        "the value of the " +
                        "integer variable is %d, " +
                        " and the string is %s",
                6.3456, 4, "mystring");
        System.out.println(fs);
    }

    // append()
    public static void stringbuilderDemo() {

        String palindrome = "Dot saw I was Tod";

        StringBuilder sb = new StringBuilder(palindrome);

        sb.reverse();  // reverse it

        System.out.println(sb);
    }
}
