package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    /**
     * Переопределяет метод pow из класса CalculatorWithOperator
     * и возводит дробное число в степень с помощью библиотеки Math
     *
     * @param x - число, которое нужно возвести
     * @param y - степень возведения
     * @return результат возведения числа x в степень y
     */
    @Override
    public double pow(double x, int y) {
        if (x > 0 && y >= 0) {
            return Math.pow(x,y);
        } else {
            return -1;
        }
    }

    /**
     * Переопределяет метод abs из класса CalculatorWithOperator
     * и возвращает модуль числа с помощью библиотеки Math
     *
     * @param x - число, которое нужно вернуть по модулю
     * @return модуль числа x
     */
    @Override
    public int abs(int x) {
        return Math.abs(x);
    }

    /**
     * Переопределяет метод sqrt из класса CalculatorWithOperator
     * и вычисляет квадратный корень из числа с помощью библиотеки Math
     *
     * @param x - число, из которого нужно вычислить квадратный корень
     * @return квадратный корень числа x
     */
    @Override
    public double sqrt(int x) {
        return Math.sqrt(x);
    }
}
