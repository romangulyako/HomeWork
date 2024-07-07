package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

public class OutputNumbersInIncrements {
    public static void main(String[] args) {
        int start, end, step;
        String result;

        try {
            System.out.print("Введите начало диапазона: ");
            String row = ConsoleUtils.inputFromConsole();
            start = Integer.parseInt(row);

            System.out.print("Введите конец диапазона: ");
            row = ConsoleUtils.inputFromConsole();
            end = Integer.parseInt(row);

            System.out.print("Введите шаг: ");
            row = ConsoleUtils.inputFromConsole();
            step = Integer.parseInt(row);

            result = outputWithIncrements(start,end,step);
        }
        catch (NumberFormatException e) {
            result = "Неверный формат ввода";
        }


        System.out.println(result);

    }

    public static String outputWithIncrements(int start, int end, int increment) {
        StringBuilder builder = new StringBuilder();

        for (int i = start; i <= end ; i += increment) {
            builder.append(i);
            if (i + increment <= end) {
                builder.append(", ");
            }
        }

        return builder.toString();
    }
}
