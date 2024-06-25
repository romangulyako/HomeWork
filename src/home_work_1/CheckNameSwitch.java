package home_work_1;

import java.util.Scanner;

public class CheckNameSwitch {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        input.close();

        switch (name) {
            case "Вася": {
                System.out.print("Привет!\nЯ тебя так долго ждал");
                break;
            }
            case "Анастасия": {
                System.out.print("Я тебя так долго ждал");
                break;
            }
            default: {
                System.out.print("Добрый день, а вы кто?");
            }
        }
    }
}
