package test.home_work_2.loops;

import home_work_2.loops.MultiplyDigits;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyDigitsTest {
    @Test
    public void printExpressionPositiveTest() {
        String result = "1 * 2 * 3 * 4 * 5 = ";
        String number = "12345";
        assertEquals(result, MultiplyDigits.printExpression(number));
    }

    @Test
    public void printExpressionZeroTest() {
        String result = "0 = ";
        String number = "0";
        assertEquals(result, MultiplyDigits.printExpression(number));
    }

    @Test
    public void printExpressionNegativeTest() {
        String result = "1 * 2 * 3 * 4 * 5 = ";
        String number = "-12345";
        assertEquals(result, MultiplyDigits.printExpression(number));
    }

    @DisplayName("Тестирование перемножения цифр числа (number, result)")
    @ParameterizedTest
    @CsvSource({
            "12345, 120",
            "0, 0",
            "-12345, 120"
    })
    public void multiplyTest(int number, long result) {
        assertEquals(result,MultiplyDigits.multiply(number));
    }
}
