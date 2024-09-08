package test.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterClassicTest {
    private final CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

    @Test
    public void incrementCountOperationTest() {


        assertEquals(0, calc.getCountOperation());
        calc.incrementCountOperation();
        assertEquals(1, calc.getCountOperation());
    }

    @Test
    public void getCountOperationTest() {
        long countOperation = Integer.MAX_VALUE;
        for (long i = 0; i < countOperation; i++) {
            calc.incrementCountOperation();
        }

        assertEquals(Integer.MAX_VALUE, calc.getCountOperation());
    }
}
