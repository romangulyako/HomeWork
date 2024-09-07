package test.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterAutoSuperTest {
    @Test
    public void getCountOperationTest() {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        calc.sum(5,5);      //1
        calc.divide(8,2);   //2

        long resultCountOperation = 2;

        assertEquals(resultCountOperation, calc.getCountOperation());
    }
}
