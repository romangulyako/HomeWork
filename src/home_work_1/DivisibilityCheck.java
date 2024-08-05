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
        if (divisionCheck(y)) {
            System.out.println("Делить на Y можно! X/Y = " + divide(x,y) + ", в остатке " + remainder(x,y));
        }
        else {
            System.out.println("Делить на Y нельзя!");
        }
    }

    public static boolean divisionCheck(int y) {
        return y != 0;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int remainder(int x,int y) {
        return x % y;
    }
}
