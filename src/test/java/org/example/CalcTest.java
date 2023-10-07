package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }

}
public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator c = new Calculator();
        assertEquals(6, c.add(4, 2)); // 示例的加法测试
    }

    @Test
    public void testSubtraction() {
        Calculator c = new Calculator();
        assertEquals(2, c.subtract(4, 2)); // 测试减法，期望结果为2
    }
}