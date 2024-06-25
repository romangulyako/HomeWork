package home_work_1;

import java.util.Scanner;

public class SleepCheck {
    public static void main(String[] args) {
        // по умолчанию рабочий день, не отпуск
        boolean weekday = true, vacation = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Сегодня выходной? 1 - да, Другая цифра - нет: ");
        int weekdayCode = input.nextInt();
        // в зависимости от введенного числа, присваиваем weekday значение true или false
        if (weekdayCode == 1) {
            weekday = false;
        }

        System.out.print("У вас отпуск? 1 - да, Другая цифра - нет: ");
        int vacationCode = input.nextInt();
        // в зависимости от введенного числа, присваиваем vacation значение true или false
        if (vacationCode == 1) {
            vacation = true;
        }

        // проверяем, можно ли спать
        if (sleepIn(weekday,vacation)) {
            System.out.print("Можно спать! Ура!");
        }
        else {
            System.out.print("Вставай, проспал!");
        }
        input.close();
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday) {
            if (vacation) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return true;
        }
    }
}
