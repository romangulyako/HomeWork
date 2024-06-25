package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class CheckNameIfElseIf {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        input.close();

        if (Objects.equals(name,"Вася")) {
            System.out.print("Привет!\nЯ тебя так долго ждал");
        }
        else  if (Objects.equals(name,"Анастасия")) {
            System.out.print("Я тебя так долго ждал");
        }
        else {
            System.out.print("Добрый день, а вы кто?");
        }
    }
}
