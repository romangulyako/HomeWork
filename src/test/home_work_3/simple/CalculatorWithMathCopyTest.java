package test.home_work_3.simple;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMathCopyTest {
    private final ICalculator calc = new CalculatorWithMathCopy();

    @DisplayName("Тестирование деления чисел (double x, double y, double result)")
    @ParameterizedTest
    @CsvSource({
            "5, 1, 5",
            "0, 5, 0",
            "5, 2, 2.5",
            "5, 0, INFINITY",
            "-5, 1, -5",
            "-5, -1, 5",
            "0, 0, 0",
            "-5, 0, INFINITY"
    })
    public void divideTest(double x, double y, String result) {
        if (x < 0 && y == 0) {
            assertEquals(Double.NEGATIVE_INFINITY, calc.divide(x,y));
        } else if (x > 0 && y == 0) {
            assertEquals(Double.POSITIVE_INFINITY, calc.divide(x,y));
        } else if (x == 0 && y == 0) {
            assertEquals(Double.NaN, calc.divide(x,y));
        } else {
            assertEquals(Double.parseDouble(result), calc.divide(x,y));
        }
    }

    @DisplayName("Тестирование умножения чисел (double x, double y, double result)")
    @ParameterizedTest
    @CsvSource({
            "5, 1, 5",
            "0, 5, 0",
            "5, 2.5, 12.5",
            "5, 0, 0",
            "-5, 1, -5",
            "-5, -1, 5",
            "0, 0, 0",
            "12345678, 12345678, 152_415_765_279_684"
    })
    public void multiplyTest(double x, double y, double result) {
        assertEquals(result, calc.multiply(x,y));
    }

    @DisplayName("Тестирование сложения чисел (double x, double y, double result)")
    @ParameterizedTest
    @CsvSource({
            "5, 1, 6",
            "0, 5, 5",
            "5, 2.5, 7.5",
            "5, 0, 5",
            "-5, 1, -4",
            "-5, -1, -6",
            "0, 0, 0"
    })
    public void sumTest(double x, double y, double result) {
        assertEquals(result, calc.sum(x,y));
    }

    @Test
    public void sumInfinityTest() {
        assertEquals(Double.POSITIVE_INFINITY, calc.sum(1, Double.POSITIVE_INFINITY));
        assertEquals(Double.NEGATIVE_INFINITY, calc.sum(1,Double.NEGATIVE_INFINITY));
        assertEquals(Double.NaN, calc.sum(Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY));
    }

    @DisplayName("Тестирование разницы чисел (double x, double y, double result)")
    @ParameterizedTest
    @CsvSource({
            "5, 1, 4",
            "0, 5, -5",
            "5, 2.5, 2.5",
            "5, 0, 5",
            "-5, 1, -6",
            "-5, -1, -4",
            "0, 0, 0"
    })
    public void subtractTest(double x, double y, double result) {
        assertEquals(result, calc.subtract(x,y));
    }

    @Test
    public void subtractInfinityTest() {
        assertEquals(Double.POSITIVE_INFINITY, calc.subtract(1, Double.NEGATIVE_INFINITY));
        assertEquals(Double.NEGATIVE_INFINITY, calc.subtract(1,Double.POSITIVE_INFINITY));
        assertEquals(Double.POSITIVE_INFINITY, calc.subtract(Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY));
        assertEquals(Double.NaN, calc.subtract(Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY));

    }

    @DisplayName("Тестирование возведения числа в степень (double x, int y, double result)")
    @ParameterizedTest
    @CsvSource({
            "5, 1, 5",
            "5, 0, 1",
            "0, 16, 0",
            "-5, 3, -125",
            "5, 3, 125",
            "0, 0, 1"
    })
    public void powTest(double x, int y, double result) {
        assertEquals(result, calc.pow(x,y));
    }

    @DisplayName("Тестирование получения числа по модулю")
    @Test
    public void absTest() {
        assertEquals(5, calc.abs(-5));
        assertEquals(5, calc.abs(5));
        assertEquals(0, calc.abs(0));
        assertEquals(Integer.MAX_VALUE, calc.abs(Integer.MIN_VALUE + 1));
    }

    @DisplayName("Тестирование вычисления квадратного корня из числа (int x, double result)")
    @ParameterizedTest
    @CsvSource({
            "25, 5",
            "0, 0",
            "-25, NaN"
    })
    public void sqrtTest(int x, double result) {
        if ( x < 0) {
            assertEquals(Double.NaN,calc.sqrt(x));
        } else {
            assertEquals(result, calc.sqrt(x));
        }
    }
}
