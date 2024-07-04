package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

public class MultiplyNumbers {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        // Проверка, корректно ли передано в аргументы целое число
        if(ConsoleUtils.isInt(args[0])) {
            int number = Integer.parseInt(args[0]);

            for (int i = 1; i <= number; i++) {
                if (i!= number) {
                    result.append(i);
                    result.append(" * ");
                } else {
                    result.append(i);
                    result.append(" = ");
                }
            }

            // Вызов метода, перемножающего числа от 1 до переданного включительно
            result.append(multiply(number)) ;
        } else {
            result.append("Вы ввели не целое число!");
        }

        System.out.println(result.toString());
    }

    public static long multiply(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
