package home_work_1;

import java.util.Scanner;

public class LetterOrSymbol {
    public static void main(String[] args) {
        // Блок кода для ввода чисел с консоли
        System.out.print("Введите код символа: ");
        Scanner input = new Scanner(System.in);
        int code = input.nextInt();
        input.close();
        // Определение, английская буква это или иной символ
        if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
            System.out.println("Это код английской буквы");
        }
        else {
            System.out.println("Это код иного символа");
        }
    }
}
