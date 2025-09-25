/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        assertEquals(2, 5 - 3, "5 - 3 should equal 2");
    }
}
