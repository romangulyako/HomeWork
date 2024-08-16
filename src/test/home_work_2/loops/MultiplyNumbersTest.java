package test.home_work_2.loops;

import home_work_2.loops.MultiplyNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyNumbersTest {
    @Test
    public void printExpressionPositiveTest() {
        String result = "1 * 2 * 3 * 4 * 5 = ";
        int number = 5;
        assertEquals(result, MultiplyNumbers.printExpression(number));
    }

    @Test
    public void printExpressionZeroTest() {
        String result = "0 = ";
        int number = 0;
        assertEquals(result, MultiplyNumbers.printExpression(number));
    }

    @Test
    public void printExpressionNegativeTest() {
        String result = "Отрицательное число не подходит";
        int number = -5;
        assertEquals(result, MultiplyNumbers.printExpression(number));
    }

    @DisplayName("Тестирование перемножения чисел от 1 до переданного (number, result)")
    @ParameterizedTest
    @CsvSource({
            "5, 120",
            "0, 0",
            "-5, -1",
            "50, -1"
    })
    public void multiplyTest(int number, long result) {
        assertEquals(result,MultiplyNumbers.multiply(number));
    }
}
