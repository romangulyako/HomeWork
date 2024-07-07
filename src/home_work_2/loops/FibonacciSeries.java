package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

public class FibonacciSeries {
    public static void main(String[] args) {
        String result;

        System.out.print("Введите число: ");
        String row = ConsoleUtils.inputFromConsole();

        if (ConsoleUtils.isInt(row) && Integer.parseInt(row) >= 0) {
            result = fibonacciOutput(Integer.parseInt(row));
        } else {
            result = "Вы ввели не целое или отрицательное число!";
        }

        System.out.println(result);

    }

    public static String fibonacciOutput(int number) {
        int currentNumber = 0;
        int nextNumber = 1;
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            int outputNumber = currentNumber + nextNumber;

            builder.append(outputNumber);
            if(i != number) {
                builder.append(", ");
            }

            currentNumber = nextNumber;
            nextNumber = outputNumber;

        }

        return builder.toString();
    }
}
