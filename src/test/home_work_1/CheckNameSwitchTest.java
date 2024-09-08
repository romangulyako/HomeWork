package test.home_work_1;

import home_work_1.CheckNameSwitch;
import home_work_1.api.ICommunicationPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CheckNameSwitchTest {
    private final ICommunicationPrinter printer = new CheckNameSwitch();

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
        assertThrows(NullPointerException.class, () -> {
            printer.welcom(null);
        });
    }
}
