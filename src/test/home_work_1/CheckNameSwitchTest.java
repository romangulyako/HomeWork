package test.home_work_1;

import home_work_1.CheckNameSwitch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CheckNameSwitchTest {
    @Test
    public void checkNameForVasyaTest() {
        assertEquals("Привет!\nЯ тебя так долго ждал", CheckNameSwitch.checkName("Вася"));
    }

    @Test
    public void checkNameForAnastasiaTest() {
        assertEquals("Я тебя так долго ждал", CheckNameSwitch.checkName("Анастасия"));
    }

    @Test
    public void checkNameForAnotherNameTest() {
        assertEquals("Добрый день, а вы кто?", CheckNameSwitch.checkName("Роман"));
    }

    @Test
    public void checkNameForNullTest() {
        assertThrows(NullPointerException.class, () -> {
            CheckNameSwitch.checkName(null);
        });
    }
}
