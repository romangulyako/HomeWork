package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

public class MultiplyNumbers {
    /*public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        // Проверка, корректно ли передано в аргументы целое число
        if(ConsoleUtils.isInt(args[0]) && Integer.parseInt(args[0]) > 0) {
            int number = Integer.parseInt(args[0]);
            result.append(printExpression(number));

            // Вызов метода, перемножающего числа от 1 до переданного включительно
            if(multiply(number) != -1) {
                result.append(multiply(number));
            } else {
                result.append(" ПРОИЗОШЛО ПЕРЕПОЛНЕНИЕ ТИПА! Решить пример невозможно!");
            }

        } else {
            result.append("Вы ввели не целое или отрицательное число число! А может и не число");
        }

        System.out.println(result.toString());
    }*/

    public static long multiply(int number) {
        if (number == 0) {
            return 0;
        }

        if (number < 0) {
            return -1;
        }
        long result = 1;


            // Проверка на переполнение
        try {
            for (int i = 1; i <= number; i++) {
                result = Math.multiplyExact(result,i);
            }

        }
        catch (ArithmeticException e) {
            result = -1;
        }

        return result;
    }

    public static String printExpression(int number) {
        if (number == 0) {
            return "0 = ";
        }

        if (number < 0) {
            return "Отрицательное число не подходит";
        }
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            if (i!= number) {
                builder.append(i);
                builder.append(" * ");
            } else {
                builder.append(i);
                builder.append(" = ");
            }
        }

        return builder.toString();
    }
}
