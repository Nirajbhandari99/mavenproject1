/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author nirajbhandari
 */
public class StringUtils {

    // Reverse a string
    public static String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    // Check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        return input.equals(reverse(input));
    }

    // Convert string to uppercase
    public static String toUpperCase(String input) {
        if (input == null) return null;
        return input.toUpperCase();
    }
}