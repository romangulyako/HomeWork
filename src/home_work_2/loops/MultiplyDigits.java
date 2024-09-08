package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

public class MultiplyDigits {
    /*public static void main(String[] args) {

        StringBuilder result = new StringBuilder();

        if(ConsoleUtils.isInt(args[0])) {                                               // Проверка, корректно ли передано в аргументы целое число
            int number = Integer.parseInt(args[0]);                           // Вызов метода, перемножающего все цифры переданного числа

            result.append(printExpression(args[0])).append(multiply(number));
        } else if(ConsoleUtils.isDouble(args[0])) {                                     // Проверка, передано ли в аргументы вещественное число
            result.append("Введено не целое число");
        } else {
            result.append("Введено не число");
        }

        System.out.println(result.toString());
    }*/

    public static long multiply (int number) {                                          // Метод, перемножающий цифры переданного в него числа
        if (number == 0) {
            return 0;
        }

        int result = 1;
        number = Math.abs(number);

        while (number > 0) {
            result *= (number % 10);
            number /= 10;
        }
        return result;
    }

    public static String printExpression(String number) {
        StringBuilder builder = new StringBuilder();

        if(ConsoleUtils.isInt(number)) {
            number = number.replaceFirst("-", "");

            char[] arr = number.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (i!= arr.length - 1) {
                    builder.append(arr[i]);
                    builder.append(" * ");
                } else {
                    builder.append(arr[i]);
                    builder.append(" = ");
                }
            }
        } else if(ConsoleUtils.isDouble(number)) {
            builder.append("Введено не целое число");
        } else {
            builder.append("Введено не число");
        }

        return builder.toString();
    }
}
