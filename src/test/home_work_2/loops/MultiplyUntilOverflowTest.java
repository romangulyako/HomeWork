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
            "3, 4052555153018976267",
            "188, 1560496482665168896",
            "-19, 799006685782884121",
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
            "3, -6289078614652622815",
            "188, -1774566438301073408",
            "-19, 3265617043834753317",
            "10, -8446744073709551616",
            "0, 0",
            "-15, -6292404967145601295"
    })
    public void valueAfterOverflowTest(int number, long result) {
        assertEquals(result, MultiplyUntilOverflow.valueAfterOverflow(number));
    }
}
