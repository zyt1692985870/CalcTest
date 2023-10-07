package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator c = new Calculator();
        assertEquals(6, c.add(4, 2));
    }

    @Test
    public void testSubtraction() {
        Calculator c = new Calculator();
        assertEquals(2, c.subtract(4, 2));
    }
}
