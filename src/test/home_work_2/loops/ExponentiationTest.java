package test.home_work_2.loops;

import home_work_2.loops.Exponentiation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExponentiationTest {
    @DisplayName("Тестирование возведения числа в степень (number, degree, result)")
    @ParameterizedTest
    @CsvSource({
            "2, 8, 256",
            "-2, 3, -8",
            "0, 300, 0",
            "1, 542, 1",
            "5, -2, -1",
            "256, 0, 1",
            "2.5, 2, 6.25"
    })
    public void exponentiationTest(double number, int degree, double result) {
        assertEquals(result, Exponentiation.exponentiation(number, degree));
    }

    @DisplayName("Проверка степени возведения на валидность (row, result)")
    @ParameterizedTest
    @CsvSource({
            "2, true",
            "-2, false",
            "0, true",
            "1.5, false",
            "5q, false",
            "abc, false"
    })
    public void isValidDegreeTest(String row, boolean result) {
        assertEquals(result, Exponentiation.isValidDegree(row));
    }
}
