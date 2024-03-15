package com.calculator;
import org.junit.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    private void assertEquals(int i, Object object, String string) {
        
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    // Add more tests for subtract, multiply, divide, including edge cases

}
