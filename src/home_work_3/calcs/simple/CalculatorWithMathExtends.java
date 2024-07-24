package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    /**
     * Метод возводит дробное число в степень
     *
     * @param x - число, которое нужно возвести
     * @param y - степень возведения
     * @return результат возведения числа x в степень y
     */
    public double pow(double x, int y) {
        if (x > 0 && y >= 0) {
            return Math.pow(x,y);
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
        return Math.abs(x);
    }

    /**
     * Метод вычисляет квадратный корень из числа
     *
     * @param x - число, из которого нужно вычислить квадратный корень
     * @return квадратный корень числа x
     */
    public double sqrt(int x) {
        return Math.sqrt(x);
    }
}
