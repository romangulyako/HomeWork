package home_work_1;

import java.util.Scanner;

public class SleepCheck {
    public static void main(String[] args) {
        // по умолчанию рабочий день, не отпуск
        boolean weekday = true, vacation = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Сегодня будний день? 1 - да, 2 - нет: ");
        int weekdayCode = input.nextInt();
        // в зависимости от введенного числа, присваиваем weekday значение true или false
        switch (weekdayCode) {
            case 1: {
                weekday = true;
                break;
            }
            case 2: {
                weekday = false;
                break;
            }
            default: {
                System.out.println("Такого варианта нет!!! Перезапустите программу!");
            }
        }
        System.out.print("У вас отпуск? 1 - да, 2 - нет: ");
        int vacationCode = input.nextInt();
        // в зависимости от введенного числа, присваиваем vacation значение true или false
        switch (vacationCode) {
            case 1: {
                vacation = true;
                break;
            }
            case 2: {
                vacation = false;
                break;
            }
            default: {
                System.out.println("Такого варианта нет!!! Перезапустите программу!");
            }
        }
        // если ответы введены корректно, то проверяем, можно ли спать
        if ((weekdayCode == 1 || weekdayCode == 2) && (vacationCode == 1 || vacationCode == 2))
        {
            if (sleepIn(weekday,vacation)) {
                System.out.print("Можно спать! Ура!");
            }
            else {
                System.out.print("Вставай, проспал!");
            }
        }
        else {
            System.out.print("Программа завершилась некорректно!");
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
