package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

public class MultiplyDigits {
    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();

        if(ConsoleUtils.isInt(args[0])) {                                               // Проверка, корректно ли передано в аргументы целое число
            int number = Math.abs(Integer.parseInt(args[0]));

            char[] arr = String.valueOf(number).toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (i!= arr.length - 1) {
                    result.append(arr[i]);
                    result.append(" * ");
                } else {
                    result.append(arr[i]);
                    result.append(" = ");
                }
            }

            result.append(multiply(number)) ;                                           // Вызов метода, перемножающего все цифры переданного числа
        } else if(ConsoleUtils.isDouble(args[0])) {                                     // Проверка, передано ли в аргументы вещественное число
            result.append("Введено не целое число");
        } else {
            result.append("Введено не число");
        }

        System.out.println(result.toString());
    }

    public static long multiply (int number) {                                          // Метод, перемножающий цифры переданного в него числа
        int result = 1;
        while (number > 0) {
            result *= (number % 10);
            number /= 10;
        }
        return result;
    }
}
