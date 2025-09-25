/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */



/**
 *
 * @author nirajbhandari
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StringUtilsTest {

    // Reverse a string
    public static String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    // Check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String reversed = reverse(input);
        return input.equals(reversed);
    }

    // Convert string to uppercase
    public static String toUpperCase(String input) {
        if (input == null) return null;
        return input.toUpperCase();
    }
}
