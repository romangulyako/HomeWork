package test.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterAutoDecoratorTest {

    private final CalculatorWithCounterAutoDecorator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMathCopy());

    @Test
    public void getCountOperationTest() {

        calc.sum(5,5);      //1
        calc.divide(8,2);   //2

        long resultCountOperation = 2;

        assertEquals(resultCountOperation, calc.getCountOperation());
    }

    @Test
    public void getCalculatorTest() {
        Class<CalculatorWithMathCopy> result = CalculatorWithMathCopy.class;
        assertEquals(result, calc.getCalculator().getClass());
    }
}
