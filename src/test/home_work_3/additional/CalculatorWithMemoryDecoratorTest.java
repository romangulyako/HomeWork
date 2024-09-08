package test.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMemoryDecoratorTest {
    private final CalculatorWithMemoryDecorator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());

    @Test
    public void getCalculatorTest() {
        Class<CalculatorWithMathCopy> result = CalculatorWithMathCopy.class;
        assertEquals(result, calc.getCalculator().getClass());
    }

    @Test
    public void loadFromMemoryWhenSavedTest(){
        double result = calc.sum(5,5);
        calc.saveResultOfOperation();

        assertEquals(result,calc.loadFromMemory());
    }

    @Test
    public void loadFromMemoryWhenNotSavedTest(){
        calc.sum(5,5);          //10

        assertEquals(0,calc.loadFromMemory());
    }
}
