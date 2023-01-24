package lesson20;

import lesson20.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author Sergii Bugaienko
 */

public class CalculatorTest {
    private static Calculator calculator;
    @BeforeAll //@BeforeEach
    public static   void createCalc() {
        calculator = new Calculator();
    }

    @Test
    @Disabled
    public void testAdd() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void testSub () {
        Assertions.assertEquals(0, calculator.sub(2, 2));
    }

    @Test
    public void divisionByZeroException() {
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () ->{
        calculator.div(1, 0);}, "ArithmeticException was expected"
        );
    }



    @Test
    public void testDiv() {
        Assertions.assertEquals(3, calculator.div(6, 2));
    }

    @Test
    public void testMul() {
        Assertions.assertEquals(21, calculator.mul(7, 3));
    }
}
