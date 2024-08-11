package test.home_work_1;

import home_work_1.MiddleNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleNumberTest {
    @DisplayName("Тестирование нахождения среднего числа (x, y, z, result)")
    @ParameterizedTest
    @CsvSource({
            "1,2,3,2",
            "3,2,1,2",
            "1,3,2,2",
            "-1,0,1,0",
            "-1,-2,-3,-2",
            "0,0,1,0"
    })
    public void middleNumberTest(int x, int y, int z, int result) {
        assertEquals(result, MiddleNumber.middleNumber(x,y,z));
    }
}
