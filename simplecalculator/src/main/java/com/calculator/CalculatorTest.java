package com.calculator;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @SuppressWarnings("unused")
    private Object add(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    private void assertEquals(int i, Object object, String string) {
        
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    // Add more tests for subtract, multiply, divide, including edge cases

}
