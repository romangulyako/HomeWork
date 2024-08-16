package test.home_work_2.utils;

import home_work_2.utils.ConsoleUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsoleUtilsTest {
    @DisplayName("Проверка, является ли строка целым числом(row, result)")
    @ParameterizedTest
    @CsvSource({
            "2, true",
            "-2, true",
            "0, true",
            "1.5, false",
            "abc, false",
            "1 5, false"
    })
    public void isIntTest(String row, boolean result) {
        assertEquals(result, ConsoleUtils.isInt(row));
    }

    @DisplayName("Проверка, является ли строка дробным числом(row, result)")
    @ParameterizedTest
    @CsvSource({
            "2, true",
            "-2, true",
            "0, true",
            "1.5, true",
            "1.5.4, false",
            "abc, false",
            "1 5, false"
    })
    public void isDoubleTest(String row, boolean result) {
        assertEquals(result, ConsoleUtils.isDouble(row));
    }
}
