package test.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMemoryTest {
    CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());

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
