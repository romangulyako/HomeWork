package home_work_1;

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        // Блок кода для ввода чисел с консоли
        Scanner input = new Scanner(System.in);
        System.out.print("Input X number: ");
        int x = input.nextInt();
        System.out.print("Input Y number: ");
        int y = input.nextInt();
        System.out.print("Input Z number: ");
        int z = input.nextInt();
        input.close();
        // Блок кода для определения среднего числа из введенных
        if (x == y || x == z || y == z) {
            System.out.println("Two or more numbers are equal. It's impossible to determine the middle number!");
        }
        else {
            System.out.println(middleNumber(x,y,z) + " is middle number!");
        }
    }

    public static int middleNumber(int x, int y, int z) {
        if (x > y) {
            if (x > z) {
                if (y > z) {
                    return y;
                }
                else {
                    return z;
                }
            }
            else {
                return x;
            }
        }
        else {
            if (x > z) {
                return x;
            }
            else {
                if (y > z) {
                    return z;
                }
                else {
                    return y;
                }
            }
        }
    }
}
