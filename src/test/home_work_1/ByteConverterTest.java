package test.home_work_1;

import home_work_1.ByteConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ByteConverterTest {
    @DisplayName("Тестирование конвертирования килобайт в байты (kBytes, bytes)")
    @ParameterizedTest
    @CsvSource({
            "1, 1024",
            "0, 0",
            "-1, -1"
    })
    public void kiloBytesToBytesTest(int kBytes, int bytes) {
        assertEquals(bytes, ByteConverter.kiloBytesToBytes(kBytes));
    }

    @DisplayName("Тестирование конвертирования байт в килобайты (bytes,kBytes)")
    @ParameterizedTest
    @CsvSource({
            "1024, 1.0",
            "0, 0",
            "-1, -1",
            "1536, 1.5"
    })
    public void bytesToKiloBytesTest(int bytes, double kBytes) {
        assertEquals(kBytes, ByteConverter.bytesToKiloBytes(bytes));
    }
}
