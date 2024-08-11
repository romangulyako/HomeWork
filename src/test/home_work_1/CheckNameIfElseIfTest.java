package test.home_work_1;

import home_work_1.CheckNameIfElseIf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckNameIfElseIfTest {
    @Test
    public void checkNameForVasyaTest() {
        assertEquals("Привет!\nЯ тебя так долго ждал", CheckNameIfElseIf.checkName("Вася"));
    }

    @Test
    public void checkNameForAnastasiaTest() {
        assertEquals("Я тебя так долго ждал", CheckNameIfElseIf.checkName("Анастасия"));
    }

    @Test
    public void checkNameForAnotherNameTest() {
        assertEquals("Добрый день, а вы кто?", CheckNameIfElseIf.checkName("Роман"));
    }

    @Test
    public void checkNameForNullTest() {
        assertEquals("Добрый день, а вы кто?", CheckNameIfElseIf.checkName(null));
    }
}
