package home_work_3.calcs.simple;

public class CalculatorWithOperator {
    /**
     * Метод делит одно число на другое
     *
     * @param x - числитель
     * @param y - знаменатель
     * @return результат деления x на y
     */
    public double divide(double x, double y) {
        return x / y;
    }

    /**
     * Метод умножает одно число на другое
     *
     * @param x - первый множитель
     * @param y - второй множитель
     * @return результат умножения x на y
     */
    public double multiply(double x, double y) {
        return x * y;
    }

    /**
     * Метод складывает одно число с другим
     *
     * @param x - первое слогаемое
     * @param y - второе слогаемое
     * @return результат сложения x и y
     */
    public double sum(double x, double y) {
        return x + y;
    }

    /**
     * Метод отнимает от одного числа другое
     *
     * @param x - уменьшаемое
     * @param y - вычитаемое
     * @return результат вычитания y из x
     */
    public double subtract(double x, double y) {
        return x - y;
    }

    /**
     * Метод возводит дробное число в степень
     *
     * @param x - число, которое нужно возвести
     * @param y - степень возведения
     * @return результат возведения числа x в степень y
     */
    public double pow(double x, int y) {
        double result = 1;

        if (x > 0 && y >= 0) {
            if (y == 0) {
                return 1;
            } else if (y == 1) {
                return x;
            } else {
                for (int i = 0; i < y; i++) {
                    result *= x;
                }
                return result;
            }
        } else {
            return -1;
        }
    }

    /**
     * Метод возвращает модуль числа
     *
     * @param x - число, которое нужно вернуть по модулю
     * @return модуль числа x
     */
    public int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    /**
     * Метод вычисляет квадратный корень из числа
     *
     * @param x - число, из которого нужно вычислить квадратный корень
     * @return квадратный корень числа x
     */
    public double sqrt(int x) {
        if (x < 0) {
            return -1;
        } else if (x == 0) {
            return 0;
        } else {
            double a = 0, b = x;
            double mid = -1;
            int countOfCycleRepetitions = 70;   // 70 повторений цикла выбрано для большей точности вычислений.
                                                // Можно как уменьшить, так и увеличить
            for (int i = 0; i < countOfCycleRepetitions; i++) {
                mid = (a + b) / 2;

                if(mid * mid < x) {
                    a = mid;
                } else {
                    b = mid;
                }
            }
            return mid;
        }
    }
}
