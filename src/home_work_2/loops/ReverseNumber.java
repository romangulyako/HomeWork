package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

public class ReverseNumber {
    public static void main(String[] args) {
        String result;

        System.out.print("Введите число: ");
        String row = ConsoleUtils.inputFromConsole();

        if (ConsoleUtils.isInt(row)) {
            int number = Math.abs(Integer.parseInt(row));
            result = "Реверс числа " + number + " (решение с возвратом INT) равен " + reverseInt(number);
            result += "\nРеверс числа " + number + " (решение с возвратом STRING) равен " + reverseString(number);
        } else {
            result = "Вы ввели не целое число!";
        }

        System.out.println(result);
    }
    // Если требуется непосредственно возвращение int, то используется этот метод (но он обрезает 0 на конце числа, т.к. целое число не начинается с 0)
    public static int reverseInt(int number) {
        int reverseNumber = 0;
        for (int i = String.valueOf(number).length(); i > 0 ; i--) {
            reverseNumber += (number % 10) * Math.pow(10,i-1);
            number /= 10;
        }

        return reverseNumber ;
    }

    // если нужно просто перевернуть число, то лучше использовать этот метод, так как он не обрезает 0 спереди перевернутого числа
    public static String reverseString (int number) {
        StringBuilder builder = new StringBuilder();

        while (number > 0) {
            builder.append(number % 10);
            number/= 10;
        }

        return builder.toString();
    }
}
