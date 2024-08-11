package test.home_work_1;

import home_work_1.SleepCheck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SleepCheckTest {
    @DisplayName("Тестирование проверки можно ли спать (weekday, vacation, result)")
    @ParameterizedTest
    @CsvSource({
            "true, true, true",
            "true, false, false",
            "false, true, true",
            "false, false, true"
    })
    public void sleepInTest(boolean weekday, boolean vacation,boolean result) {
        assertEquals(result, SleepCheck.sleepIn(weekday,vacation));
    }
}
