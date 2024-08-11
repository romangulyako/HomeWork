package test.home_work_1;

import home_work_1.PhoneNumberFormat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneNumberFormatTest {
    @Test
    public void createPhoneNumberValidTest() {
        assertEquals("(123) 456-7890", PhoneNumberFormat.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void createPhoneNumberWrongCountOfNumbersTest() {
        assertEquals("Неверное количество символов", PhoneNumberFormat.createPhoneNumber(new int[]{1, 2, 3}));
    }

    @Test
    public void createPhoneNumberWrongValueOfNumbersTest() {
        assertEquals("Одно из чисел массива больше 10. Неверный формат",
                PhoneNumberFormat.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    public void createPhoneNumberFromNullTest() {
        assertThrows(NullPointerException.class, () -> {
            PhoneNumberFormat.createPhoneNumber(null);
        });
    }
}
