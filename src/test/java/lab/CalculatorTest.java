package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addShouldReturnSum() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtractShouldReturnDifference() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void multiplyShouldReturnProduct() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void divideShouldReturnResult() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    void divideByZeroShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0));
    }
}
