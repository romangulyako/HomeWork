package test.home_work_1;

import home_work_1.CheckNameIfElse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckNameIfElseTest {
    @Test
    public void checkNameForVasyaTest() {
        assertEquals("Привет!\nЯ тебя так долго ждал", CheckNameIfElse.checkName("Вася"));
    }

    @Test
    public void checkNameForAnastasiaTest() {
        assertEquals("Я тебя так долго ждал", CheckNameIfElse.checkName("Анастасия"));
    }

    @Test
    public void checkNameForAnotherNameTest() {
        assertEquals("Добрый день, а вы кто?", CheckNameIfElse.checkName("Роман"));
    }

    @Test
    public void checkNameForNullTest() {
        assertEquals("Добрый день, а вы кто?", CheckNameIfElse.checkName(null));
    }
}
