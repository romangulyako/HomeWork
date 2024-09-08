package home_work_2.loops;

import home_work_2.utils.ConsoleUtils;

public class MultiplyUntilOverflow {
    /*public static void main(String[] args) {
        boolean isExit = false;

        while (!isExit) {
            System.out.println("Введите 0 если хотите выйти из программы");
            System.out.print("Введите множитель: ");
            int factor = Integer.parseInt(ConsoleUtils.inputFromConsole());

            if(factor != 0) {
                System.out.println("Значение до переполнения: " + multiplyUntilOverflow(factor));
                System.out.println("Значение после переполнения: " +valueAfterOverflow(factor));
            } else {
                isExit = true;
            }
        }
    }*/

    public static long multiplyUntilOverflow (int factor) {
        if (factor == 0) {
            return 0;
        }

        long a = 1;

        try {
            while (true) {
                a = Math.multiplyExact(a,factor);
            }
        } catch (ArithmeticException e) {

        }

        return  a;
    }

    public static long valueAfterOverflow(int factor) {
        return multiplyUntilOverflow(factor) * factor;
    }
}
