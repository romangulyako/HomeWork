package test.home_work_1;

import home_work_1.LeapYear;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {
    @DisplayName("Тестирование проверки високосный ли год (year, result)")
    @ParameterizedTest
    @CsvSource({
            "2024, true",
            "2022, false",
            "1600, true",
            "1700, false"
    })
    public void isLeapYearTest(int year, boolean result) {
        assertEquals(result, LeapYear.isLeapYear(year));
    }
}
