package test.home_work_1;

import home_work_1.LetterOrSymbol;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterOrSymbolTest {
    @DisplayName("Тестирование проверки английская ли буква (code, result)")
    @ParameterizedTest
    @CsvSource({
            "66, true",
            "92, false",
            "100, true",
            "150, false",
            "0, false",
            "-150, false"
    })
    public void isEnglishLetterTest(int code, boolean result) {
        assertEquals(result, LetterOrSymbol.isEnglishLetter(code));
    }
}
