package home_work_1;

import java.util.Scanner;

public class OddNumberCheck {
    public static void main(String[] args) {
        // Блок кода для ввода чисел с консоли
        Scanner input = new Scanner(System.in);
        System.out.print("Input X number: ");
        int x = input.nextInt();
        System.out.print("Input Y number: ");
        int y = input.nextInt();
        input.close();
        // Блок кода для проверки чисел на нечетность
        if (isOddNumber(x) && isOddNumber(y)) {
            System.out.println(x + " and " + y + " are odd numbers!");
        }
        else if (isOddNumber(x)) {
            System.out.println(x + " is odd number!");
        }
        else  if (isOddNumber(y)){
            System.out.println(y + " is odd number!");
        }
        else {
            System.out.println(x + " and " + y + " are even numbers");
        }
    }

    public static boolean isOddNumber(int x) {
        return x % 2 == 1;
    }
}
