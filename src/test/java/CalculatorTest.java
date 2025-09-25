/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nirajbhandari
 */
public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, 2 + 3);
    }

    @Test
    public void testSubtract() {
        assertEquals(2, 5 - 3);
    }
}
