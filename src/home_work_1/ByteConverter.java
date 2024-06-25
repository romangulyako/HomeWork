package home_work_1;

import java.util.Scanner;

public class ByteConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Чтобы перевести кБ в Б нажмите 1, Б в кБ нажмите другую цифру: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Введите количество килобайт: ");
            int kBytes = input.nextInt();
            System.out.println(kBytes + " кБ = " + kBytes * 1024 + " Б");
        }
        else {
            System.out.print("Введите количество байт: ");
            int bytes = input.nextInt();
            System.out.println(bytes + " Б = " + bytes / 1024.0 + " кБ");
        }
        input.close();
    }
}
