package test.home_work_2.loops;

import home_work_2.loops.MultiplyUntilOverflow;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyUntilOverflowTest {
    @DisplayName("Тестирование перемножения числа самого на себя до переполнения (number, result)")
    @ParameterizedTest
    @CsvSource({
            "10, 1000000000000000000",
            "0, 0",
            "-15, 6568408355712890625"
    })
    public void multiplyUntilOverflowTest(int number, long result) {
        assertEquals(result, MultiplyUntilOverflow.multiplyUntilOverflow(number));
    }

    @DisplayName("Тестирование умножения числа на себя после переполнения (number, result)")
    @ParameterizedTest
    @CsvSource({
            "10, -8446744073709551616",
            "0, 0",
            "-15, -6292404967145601295"
    })
    public void valueAfterOverflowTest(int number, long result) {
        assertEquals(result, MultiplyUntilOverflow.valueAfterOverflow(number));
    }
}
