package test.home_work_2.loops;

import home_work_2.loops.LoopsTasks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopsTasksTest {
    @DisplayName("Тестирование нахождения максимальной цифры числа (number, result)")
    @ParameterizedTest
    @CsvSource({
            "2, 2",
            "0, 0",
            "4348454, 8",
            "-56589, 9"
    })
    public void maxDigitTest(int number, int result) {
        assertEquals(result, LoopsTasks.maxDigit(number));
    }

    @DisplayName("Тестирование подсчета четных цифр числа (number, result)")
    @ParameterizedTest
    @CsvSource({
            "21235, 2",
            "0, 0",
            "1357, 0",
            "-56589, 2"
    })
    public void evenDigitsCounterTest(int number, int result) {
        assertEquals(result,LoopsTasks.evenDigitsCounter(number));
    }

    @DisplayName("Тестирование подсчета нечетных цифр числа (number, result)")
    @ParameterizedTest
    @CsvSource({
            "21235, 3",
            "0, 0",
            "2468, 0",
            "-56589, 3"
    })
    public void oddDigitsCounterTest(int number, int result) {
        assertEquals(result,LoopsTasks.oddDigitsCounter(number));
    }

    @Test
    public void fibonacciOutputForPositiveNumberTest() {
        String result = "1, 2, 3, 5, 8";
        int number = 5;
        assertEquals(result, LoopsTasks.fibonacciOutput(number));
    }

    @Test
    public void fibonacciOutputForZeroTest() {
        String result = "";
        int number = 0;
        assertEquals(result, LoopsTasks.fibonacciOutput(number));
    }

    @Test
    public void fibonacciOutputForNegativeNumberTest() {
        String result = "Вы ввели отрицательное число!";
        int number = -5;
        assertEquals(result, LoopsTasks.fibonacciOutput(number));
    }

    @Test
    public void outputWithIncrementsNormalTest() {
        int start = 1;
        int end = 10;
        int step = 2;
        String result = "1, 3, 5, 7, 9";
        assertEquals(result,LoopsTasks.outputWithIncrements(start,end,step));
    }

    @Test
    public void outputWithIncrementsZeroTest() {
        int start = 1;
        int end = 10;
        int step = 0;
        String result = "Шаг не может быть меньше или равен 0!";
        assertEquals(result,LoopsTasks.outputWithIncrements(start,end,step));
    }

    @Test
    public void outputWithIncrementsNegativeTest() {
        int start = 1;
        int end = 10;
        int step = -2;
        String result = "Шаг не может быть меньше или равен 0!";
        assertEquals(result,LoopsTasks.outputWithIncrements(start,end,step));
    }

    @Test
    public void outputWithIncrementsStartMoreEndTest() {
        int start = 20;
        int end = 10;
        int step = 2;
        String result = "Начало диапазона не может быть больше конца!";
        assertEquals(result,LoopsTasks.outputWithIncrements(start,end,step));
    }

    @DisplayName("Тестирование переворота числа (number, result)")
    @ParameterizedTest
    @CsvSource({
            "21235, 53212",
            "0, 0",
            "-56589, -1"
    })
    public void reverseNumberToIntTest(int number, int result) {
        assertEquals(result,LoopsTasks.reverseNumberToInt(number));
    }

    @DisplayName("Тестирование переворота числа (number, result)")
    @ParameterizedTest
    @CsvSource({
            "21235, 53212",
            "0,0",
            "-56589,Число меньше 0 нельзя перевернуть"
    })
    public void reverseNumberToStringTest(int number, String result) {
        assertEquals(result,LoopsTasks.reverseNumberToString(number));
    }
}
