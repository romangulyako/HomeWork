package test.home_work_1;

import home_work_1.BitwiseOperations;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitwiseOperationsTest {

    @DisplayName("Тестирование побитового ИЛИ (x, y, result)")
    @ParameterizedTest
    @CsvSource({
            "13, 27, 31",
            "13, 0, 13",
            "13, 13, 13",
            "0,0,0",
            "-9,-52,-1"
    })
    public void bitwiseOrTest(int x, int y, int result) {
        assertEquals(result, BitwiseOperations.bitwiseOr(x,y));
    }

    @DisplayName("Тестирование побитового И (x, y, result)")
    @ParameterizedTest
    @CsvSource({
            "13, 27, 9",
            "13, 0, 0",
            "13, 13, 13",
            "0,0,0",
            "-9,-52,-60"
    })
    public void bitwiseAndTest(int x, int y, int result) {
        assertEquals(result, BitwiseOperations.bitwiseAnd(x,y));
    }
}
