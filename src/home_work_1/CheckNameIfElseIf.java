package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Objects;
import java.util.Scanner;

public class CheckNameIfElseIf implements ICommunicationPrinter {
    /*public static void main(String[] args) {
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
        else  if (Objects.equals(name,"Анастасия")) {
            return "Я тебя так долго ждал";
        }
        else {
            return "Добрый день, а вы кто?";
        }
    }*/

    @Override
    public String welcom(String name) {
        if (Objects.equals(name,"Вася")) {
            return "Привет!\nЯ тебя так долго ждал";
        }
        else  if (Objects.equals(name,"Анастасия")) {
            return "Я тебя так долго ждал";
        }
        else {
            return "Добрый день, а вы кто?";
        }
    }
}
