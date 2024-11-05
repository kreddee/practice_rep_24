package org.example;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPalindrome(int x) {
        String numberString = Integer.toString(x);
        char[] numberArray = numberString.toCharArray();
        char[] numberReversed = numberString.toCharArray();

        // Reverse the array using a loop
        for (int i = 0, j = numberReversed.length - 1; i < j; i++, j--) {
            char temp = numberReversed[i];
            numberReversed[i] = numberReversed[j];
            numberReversed[j] = temp;
        }

        return Arrays.equals(numberArray, numberReversed);
    }

    public static void main(String[] args) {
        boolean result = isPalindrome(15575512);
        System.out.printf(String.valueOf(result));
    }
}
