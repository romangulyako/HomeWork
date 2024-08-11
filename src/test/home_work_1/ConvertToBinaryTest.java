package test.home_work_1;

import home_work_1.ConvertToBinary;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertToBinaryTest {
    @DisplayName("Тестирование перевода числа в прямой код (number, directCode)")
    @ParameterizedTest
    @CsvSource({
            "0, 00000000",
            "5, 00000101",
            "-5, 00000101",
            "127,01111111",
            "-128,10000000"
    })
    public void convertToDirectCodeTest(byte number, String directCode) {
        assertEquals(directCode, ConvertToBinary.convertToDirectCode(number));
    }

    @DisplayName("Тестирование перевода прямого кода в обратный (directCode, reverseCode)")
    @ParameterizedTest
    @CsvSource({
            "00000000, 11111111",
            "11111111, 00000000",
            "10101010, 01010101"
    })
    public void convertToReverseCodeTest(String directCode, String reverseCode) {
        assertEquals(reverseCode, ConvertToBinary.convertToReverseCode(directCode));
    }

    @DisplayName("Тестирование перевода обратного кода в дополнительный (reverseCode, additionalCode)")
    @ParameterizedTest
    @CsvSource({
            "00000000, 00000001",
            "01111111, 10000000",
            "01010101, 01010110"
    })
    public void convertToAdditionalCodeTest(String reverseCode, String additionalCode) {
        assertEquals(additionalCode, ConvertToBinary.convertToAdditionalCode(reverseCode));
    }

    @DisplayName("Тестирование перевода числа в двоичную систему счисления (number, binaryCode)")
    @ParameterizedTest
    @CsvSource({
            "0, 00000000",
            "5, 00000101",
            "-5, 11111011",
            "127,01111111",
            "-128,10000000"
    })
    public void toBinaryStringTest(byte number, String binaryCode) {
        assertEquals(binaryCode, ConvertToBinary.toBinaryString(number));
    }
}
