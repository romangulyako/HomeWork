package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class CheckNameIfElse {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        input.close();

        System.out.println(checkName(name));
    }

    public static String checkName(String name) {
        if (Objects.equals(name,"Вася")) {
            return "Привет!\nЯ тебя так долго ждал";
        }
        else {
            if (Objects.equals(name,"Анастасия")) {
                return "Я тебя так долго ждал";
            }
            else {
                return "Добрый день, а вы кто?";
            }
        }
    }
}
