package home_work_1;

import java.util.Scanner;

public class CheckNameSwitch {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        input.close();

        System.out.println(checkName(name));
    }

    public static String checkName(String name) {
        switch (name) {
            case "Вася": {
                return "Привет!\nЯ тебя так долго ждал";
            }
            case "Анастасия": {
                return "Я тебя так долго ждал";
            }
            default: {
                return "Добрый день, а вы кто?";
            }
        }
    }
}
