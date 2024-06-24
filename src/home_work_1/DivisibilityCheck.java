package home_work_1;

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        // Блок кода для ввода чисел с консоли
        Scanner input = new Scanner(System.in);
        System.out.print("Введите X: ");
        int x = input.nextInt();
        System.out.print("Введите Y: ");
        int y = input.nextInt();
        input.close();
        // Проверка на делимость и вывод результата деления
        if (y != 0) {
            System.out.println("Делить на Y можно! X/Y = " + x / y + ", в остатке " + x % y);
        }
        else {
            System.out.println("Делить на Y нельзя!");
        }
    }
}
