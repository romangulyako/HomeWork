package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    /**
     * Поле, хранящее количество операций, выполненных калькулятором
     */
    private long countOperation = 0;

    /**
     * Метод возвращет количество операций, выполненных калькулятором
     *
     * @return поле countOperation
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     * Переопределяет метод divide из класса CalculatorWithOperator,
     * увеличивает счетчик операций на 1 и вызывает метод divide из родительского класса
     *
     * @param x - числитель
     * @param y - знаменатель
     * @return результат деления x на y
     */
    @Override
    public double divide(double x, double y) {
        countOperation++;
        return super.divide(x,y);
    }

    /**
     * Переопределяет метод multiply из класса CalculatorWithOperator,
     * увеличивает счетчик операций на 1 и вызывает метод multiply из родительского класса
     *
     * @param x - первый множитель
     * @param y - второй множитель
     * @return результат умножения x на y
     */
    @Override
    public double multiply(double x, double y) {
        countOperation++;
        return super.multiply(x,y);
    }

    /**
     * Переопределяет метод sum из класса CalculatorWithOperator,
     * увеличивает счетчик операций на 1 и вызывает метод sum из родительского класса
     *
     * @param x - первое слогаемое
     * @param y - второе слогаемое
     * @return результат сложения x и y
     */
    @Override
    public double sum(double x, double y) {
        countOperation++;
        return super.sum(x,y);
    }

    /**
     * Переопределяет метод subtract из класса CalculatorWithOperator,
     * увеличивает счетчик операций на 1 и вызывает метод subtract из родительского класса
     *
     * @param x - уменьшаемое
     * @param y - вычитаемое
     * @return результат вычитания y из x
     */
    @Override
    public double subtract(double x, double y) {
        countOperation++;
        return super.subtract(x,y);
    }

    /**
     * Переопределяет метод pow из класса CalculatorWithMathExtends,
     * увеличивает счетчик операций на 1 и вызывает метод pow из родительского класса
     *
     * @param x - число, которое нужно возвести
     * @param y - степень возведения
     * @return результат возведения числа x в степень y
     */
    @Override
    public double pow(double x, int y) {
        countOperation++;
        return super.pow(x,y);
    }

    /**
     * Переопределяет метод abs из класса CalculatorWithMathExtends,
     * увеличивает счетчик операций на 1 и вызывает метод abs из родительского класса
     *
     * @param x - число, которое нужно вернуть по модулю
     * @return модуль числа x
     */
    @Override
    public int abs(int x) {
        countOperation++;
        return super.abs(x);
    }

    /**
     * Переопределяет метод sqrt из класса CalculatorWithMathExtends,
     * увеличивает счетчик операций на 1 и вызывает метод sqrt из родительского класса
     *
     * @param x - число, из которого нужно вычислить квадратный корень
     * @return квадратный корень числа x
     */
    @Override
    public double sqrt(int x) {
        countOperation++;
        return super.sqrt(x);
    }
}
