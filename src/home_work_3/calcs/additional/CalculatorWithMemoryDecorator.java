package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    /**
     * Поле, хранящее экземпляр калькулятора, переданного в конструктор
     */
    private ICalculator calc;

    /**
     * Поле, хранящее промежуточный результат выполненной операции
     */
    private double memory;

    /**
     * Флаг, который указывает, был ли сохранен промежуточный результат
     */
    private boolean isSaved;

    /**
     * Конструктор класса CalculatorWithMemoryDecorator,
     * передает в класс объект типа ICalculator
     *
     * @param calc экземпляр класса ICalculator
     */
    public CalculatorWithMemoryDecorator(ICalculator calc) {
        this.calc = calc;
    }

    /**
     * Метод для реализации сохранения промежуточного результата
     */
    public void saveResultOfOperation() {
        isSaved = true;

    }

    /**
     * Метод возвращает промежуточный результат
     * Если ничего не было сохранено, возвращает 0
     *
     * @return результат выполненной операции или 0
     */
    public double loadFromMemory() {
        if(isSaved) {
            isSaved = false;
            return memory;
        }
        else {
            return 0;
        }
    }

    /**
     * Метод делит одно число на другое с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x числитель
     * @param y знаменатель
     * @return результат деления x на y
     */
    public double divide(double x, double y) {
        memory = calc.divide(x,y);
        return memory;
    }

    /**
     * Метод умножает одно число на другое с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x первый множитель
     * @param y второй множитель
     * @return результат умножения x на y
     */
    public double multiply(double x, double y) {
        memory = calc.multiply(x,y);
        return memory;
    }

    /**
     * Метод складывает одно число с другим с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x первое слогаемое
     * @param y второе слогаемое
     * @return результат сложения x и y
     */
    public double sum(double x, double y) {
        memory = calc.sum(x,y);
        return memory;
    }

    /**
     * Метод отнимает от одного числа другое с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x уменьшаемое
     * @param y вычитаемое
     * @return результат вычитания y из x
     */
    public double subtract(double x, double y) {
        memory = calc.subtract(x,y);
        return memory;
    }

    /**
     * Метод возводит дробное число в степень с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x число, которое нужно возвести
     * @param y степень возведения
     * @return результат возведения числа x в степень y
     */
    public double pow(double x, int y) {
        memory = calc.pow(x,y);
        return memory;
    }

    /**
     * Метод возвращает модуль числа с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x число, которое нужно вернуть по модулю
     * @return модуль числа x
     */
    public int abs(int x) {
        memory = calc.abs(x);
        return (int)memory;
    }

    /**
     * Метод вычисляет квадратный корень из числа с помощью экземпляра класса, реализующего ICalculator
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x число, из которого нужно вычислить квадратный корень
     * @return квадратный корень числа x
     */
    public double sqrt(int x) {
        memory = calc.sqrt(x);
        return memory;
    }

    /**
     * Метод возвращает калькулятор, переданный в конструктор экземпляра класса
     *
     * @return ICalculator calc
     */
    public ICalculator getCalculator() {
        return calc;
    }
}
