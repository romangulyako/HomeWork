package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

import java.util.Random;

public class LoopsTasks {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        System.out.print("Введите число (не менее 1000): ");
        String row = ConsoleUtils.inputFromConsole();

        if (ConsoleUtils.isInt(row)) {
            int number = Math.abs(Integer.parseInt(row));

            builder.append("Тест задания 1.5.1\n");
            String str = "Максимальная цифра числа " + Integer.parseInt(row) + " это " + maxDigit(number);
            builder.append(str);
            builder.append("\n---------------------------------------------");

            builder.append("\nТест задания 1.5.2\n");
            str =  "Процент четных чисел из " + number + " случайно выбранных составляет " + probabilityOfEvenNumbers(number);
            builder.append(str);
            builder.append("\n---------------------------------------------");

            builder.append("\nТест задания 1.5.3\n");
            str = "Число " + Integer.parseInt(row) + " содержит " + oddDigitsCounter(number) + " нечетных и " + evenDigitsCounter(number) + " четных цифр";
            builder.append(str);
            builder.append("\n---------------------------------------------");

            builder.append("\nТест задания 1.5.6\n");
            str = "Реверс числа " + number + " (решение с возвратом INT) равен " + reverseNumberToInt(number);
            str += "\nРеверс числа " + number + " (решение с возвратом STRING) равен " + reverseNumberToString(number);
            builder.append(str);
            builder.append("\n---------------------------------------------");
        } else {
            builder.append("Неверный фрмат ввода");
        }
        System.out.println(builder.toString());

        builder = new StringBuilder();

        System.out.println("\nТест задания 1.5.4\n");
        System.out.print("Введите число: ");
        row = ConsoleUtils.inputFromConsole();

        if (ConsoleUtils.isInt(row) && Integer.parseInt(row) >= 0) {
            String str = fibonacciOutput(Integer.parseInt(row));
            builder.append(str);
        } else {
            builder.append("Неверный формат ввода!");
        }
        builder.append("\n---------------------------------------------");

        System.out.println(builder.toString());

        builder = new StringBuilder();

        System.out.println("\nТест задания 1.5.5\n");
        int start, end, step;
        try {
            System.out.print("Введите начало диапазона: ");
            row = ConsoleUtils.inputFromConsole();
            start = Integer.parseInt(row);

            System.out.print("Введите конец диапазона: ");
            row = ConsoleUtils.inputFromConsole();
            end = Integer.parseInt(row);

            System.out.print("Введите шаг: ");
            row = ConsoleUtils.inputFromConsole();
            step = Integer.parseInt(row);

            builder.append(outputWithIncrements(start,end,step));
        }
        catch (NumberFormatException e) {
            builder.append("Неверный формат ввода");
        }

        System.out.println(builder.toString());
    }

    // Поиск максимальной цифры числа
    public static int maxDigit (int number) {
        int max = -1;
        while (number > 0) {
            if (number % 10 > max) {
                max = number % 10;
            }
            number /= 10;
        }
        return max;
    }

    // Определение вероятности четных случайных чисел
    public static double probabilityOfEvenNumbers(int countNumbers) {
        Random rnd = new Random();
        double countEven = 0;

        for (int i = 0; i < countNumbers; i++) {
            if(rnd.nextInt() % 2 == 0) {
                countEven++;
            }
        }

        return countEven / countNumbers * 100;
    }

    // Подсчет нечетных цифр числа
    public static int oddDigitsCounter(int number) {
        int oddCount = 0;
        while (number > 0) {
            if(number % 2 == 1) {
                oddCount++;
            }
            number /= 10;
        }
        return oddCount;
    }

    // Подсчет четных цифр числа
    public static int evenDigitsCounter(int number) {
        int evenCount = 0;
        while (number > 0) {
            if(number % 2 == 0) {
                evenCount++;
            }
            number /= 10;
        }
        return evenCount;
    }

    // Возвращает ряд Фибоначчи в размере, переданном в метод
    public static String fibonacciOutput(int size) {
        int currentNumber = 0;
        int nextNumber = 1;
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= size; i++) {
            int outputNumber = currentNumber + nextNumber;

            builder.append(outputNumber);
            if(i != size) {
                builder.append(", ");
            }

            currentNumber = nextNumber;
            nextNumber = outputNumber;
        }

        return builder.toString();
    }

    // Возвращает ряд чисел в диапазоне с шагом
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

    // Переворот числа. Если требуется непосредственно возвращение int, то используется этот метод (но он обрезает 0 на конце числа, т.к. целое число не начинается с 0)
    public static int reverseNumberToInt(int number) {
        int reverseNumber = 0;
        for (int i = String.valueOf(number).length(); i > 0 ; i--) {
            reverseNumber += (number % 10) * Math.pow(10,i-1);
            number /= 10;
        }

        return reverseNumber ;
    }

    // Переворот числа. Если нужно просто перевернуть число, то лучше использовать этот метод, так как он не обрезает 0 спереди перевернутого числа
    public static String reverseNumberToString (int number) {
        StringBuilder builder = new StringBuilder();

        while (number > 0) {
            builder.append(number % 10);
            number/= 10;
        }

        return builder.toString();
    }
}
