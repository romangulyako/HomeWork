package test.home_work_1;

import home_work_1.CheckNameIfElseIf;
import home_work_1.api.ICommunicationPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckNameIfElseIfTest {
    private final ICommunicationPrinter printer = new CheckNameIfElseIf();

    @Test
    public void checkNameForVasyaTest() {
        assertEquals("Привет!\nЯ тебя так долго ждал", printer.welcom("Вася"));
    }

    @Test
    public void checkNameForAnastasiaTest() {
        assertEquals("Я тебя так долго ждал", printer.welcom("Анастасия"));
    }

    @Test
    public void checkNameForAnotherNameTest() {
        assertEquals("Добрый день, а вы кто?", printer.welcom("Роман"));
    }

    @Test
    public void checkNameForNullTest() {
        assertEquals("Добрый день, а вы кто?", printer.welcom(null));
    }
}
