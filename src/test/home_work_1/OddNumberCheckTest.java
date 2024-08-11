package test.home_work_1;

import home_work_1.OddNumberCheck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddNumberCheckTest {
    @DisplayName("Тестирование проверки числа на нечетность (x, result)")
    @ParameterizedTest
    @CsvSource({
            "1,true",
            "2,false",
            "-1,true",
            "-2,false",
            "0, false"
    })
    public void isOddNumberTest(int x,boolean result) {
        assertEquals(result, OddNumberCheck.isOddNumber(x));
    }
}
