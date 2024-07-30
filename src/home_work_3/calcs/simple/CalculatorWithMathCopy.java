package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
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
        return Math.pow(x,y);
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
