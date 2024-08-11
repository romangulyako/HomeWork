package test.home_work_1;

import home_work_1.DivisibilityCheck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibilityCheckTest {
    @DisplayName("Тестирование возможности деления на число (y, result)")
    @ParameterizedTest
    @CsvSource({
            "1, true",
            "0, false",
            "-1, true"
    })
    public void divisionCheckTest(int y, boolean result) {
        assertEquals(result, DivisibilityCheck.divisionCheck(y));
    }

    @DisplayName("Тестирование деления чисел (x, y, result)")
    @ParameterizedTest
    @CsvSource({
            "5, 1, 5",
            "0, 5, 0",
            "27, 5, 5",
            "-7, 5, -1"
    })
    public void divideTest(int x, int y, int result) {
        assertEquals(result, DivisibilityCheck.divide(x,y));
    }

    @DisplayName("Тестирование получения остатка от деления (x, y, result)")
    @ParameterizedTest
    @CsvSource({
            "5, 1, 0",
            "0, 5, 0",
            "1, 5, 1",
            "27, 5, 2",
            "-7, 5, -2"
    })
    public void remainderTest(int x, int y, int result) {
        assertEquals(result, DivisibilityCheck.remainder(x,y));
    }
}
