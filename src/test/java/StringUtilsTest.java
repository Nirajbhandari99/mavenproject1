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
        return input.equals(reverse(input));
    }

    // Convert string to uppercase
    public static String toUpperCase(String input) {
        if (input == null) return null;
        return input.toUpperCase();
    }

    @Test
    public void testReverse() {
        assertEquals("dcba", reverse("abcd"));
    }

    @Test
    public void testPalindrome() {
        assertTrue(isPalindrome("madam"));
        assertFalse(isPalindrome("hello"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", toUpperCase("hello"));
    }
}
