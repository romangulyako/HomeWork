package home_work_1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Блок ввода данных с консоли
        System.out.print("Введите год: ");
        Scanner input = new Scanner(System.in);
        // Определение, високосный ли год
        // Високосный год - любой, кратный 4, кроме кратных 100 и не кратных 400
        int year = input.nextInt();
        input.close();
        if (isLeapYear(year)) {
            System.out.print("Год високосный");
        }
        else {
            System.out.print("Год не високосный");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
}
