package se.iths;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @BeforeAll
    static void beforeAll () {
        System.out.println("Denna text visas före testerna");
    }

    @DisplayName("Testar add-metoden i Calculatorklasen")
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.add(5, 7));
    }

    @Disabled
    @DisplayName("Testar subtract-metoden i Calculatorklasen")
    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.subtract(5, 7));
    }

    @DisplayName("Testar multiply-metoden i Calculatorklasen")
    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(35, calculator.multiply(5, 7));
    }

    @RepeatedTest(5)
    @DisplayName("Testar divide-metoden i Calculatorklasen")
    void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(10, 5));
    }




}
