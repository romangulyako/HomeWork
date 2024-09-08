package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

public class MultiplyNumbersRecursive {
    /*public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        // Проверка, корректно ли передано в аргументы целое число
        if(ConsoleUtils.isInt(args[0]) && Integer.parseInt(args[0]) > 0) {
            int number = Integer.parseInt(args[0]);

            result.append(printExpression(number));

            // Вызов метода, перемножающего числа от 1 до переданного включительно
            result.append(multiplyRecursive(number)) ;
        } else {
            result.append("Вы ввели не целое или отрицательное число число! А может и не число");
        }

        System.out.println(result.toString());
    }*/

    public static long multiplyRecursive(int number) {
        if (number == 0) {
            return 0;
        }

        if (number < 0) {
            return -1;
        }

        if (number == 1) {
            return number;
        }

        // Метод будет вызываться, пока число не уменьшится до 1, затем сработает блок if выше и рекурсия остановится и пойдет в обратном порядке
        return number * multiplyRecursive(number - 1);
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
