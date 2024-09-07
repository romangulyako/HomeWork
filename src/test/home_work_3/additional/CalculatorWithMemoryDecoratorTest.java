package test.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMemoryDecoratorTest {
    @Test
    public void getCalculatorTest() {
        CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());

        Class<CalculatorWithMathCopy> result = CalculatorWithMathCopy.class;
        assertEquals(result, calc.getCalculator().getClass());
    }
}
