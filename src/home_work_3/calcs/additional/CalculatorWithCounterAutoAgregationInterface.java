package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    /**
     * Поле, хранящее экземпляр калькулятора, переданного в конструктор
     */
    private ICalculator calc;

    /**
     * Поле, хранящее количество операций, выполненных калькулятором
     */
    private long countOperation = 0;

    /**
     * Конструктор класса CalculatorWithCounterAutoAgregationInterface
     * передает в класс объект типа ICalculator, с помощью
     * которого будут проводиться математические операции
     *
     * @param calc - экземпляр класса ICalculator
     */
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calc) {
        this.calc = calc;
    }

    /**
     * Метод возвращет количество операций, выполненных калькулятором
     *
     * @return поле countOperation
     */
    public long getCountOperation() {
        return countOperation;
    }

    /**
     * Метод делит одно число на другое с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - числитель
     * @param y - знаменатель
     * @return результат деления x на y
     */
    public double divide(double x, double y) {
        countOperation++;
        return calc.divide(x,y);
    }

    /**
     * Метод умножает одно число на другое с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - первый множитель
     * @param y - второй множитель
     * @return результат умножения x на y
     */
    public double multiply(double x, double y) {
        countOperation++;
        return calc.multiply(x,y);
    }

    /**
     * Метод складывает одно число с другим с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - первое слогаемое
     * @param y - второе слогаемое
     * @return результат сложения x и y
     */
    public double sum(double x, double y) {
        countOperation++;
        return calc.sum(x,y);
    }

    /**
     * Метод отнимает от одного числа другое с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - уменьшаемое
     * @param y - вычитаемое
     * @return результат вычитания y из x
     */
    public double subtract(double x, double y) {
        countOperation++;
        return calc.subtract(x,y);
    }

    /**
     * Метод возводит дробное число в степень с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - число, которое нужно возвести
     * @param y - степень возведения
     * @return результат возведения числа x в степень y
     */
    public double pow(double x, int y) {
        countOperation++;
        return calc.pow(x,y);
    }

    /**
     * Метод возвращает модуль числа с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - число, которое нужно вернуть по модулю
     * @return модуль числа x
     */
    public int abs(int x) {
        countOperation++;
        return calc.abs(x);
    }

    /**
     * Метод вычисляет квадратный корень из числа с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - число, из которого нужно вычислить квадратный корень
     * @return квадратный корень числа x
     */
    public double sqrt(int x) {
        countOperation++;
        return calc.sqrt(x);
    }
}
