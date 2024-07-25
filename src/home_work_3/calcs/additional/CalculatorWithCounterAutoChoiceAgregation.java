package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    /**
     * Поле, хранящее экземпляр калькулятора, описанного классом CalculatorWithOperator
     */
    CalculatorWithOperator calcWithOperator;

    /**
     * Поле, хранящее экземпляр калькулятора, описанного классом CalculatorWithMathCopy
     */
    CalculatorWithMathCopy calcWithMathCopy;

    /**
     * Поле, хранящее экземпляр калькулятора, описанного классом CalculatorWithMathExtends
     */
    CalculatorWithMathExtends calcWithMathExtends;

    /**
     * Поле, хранящее количество операций, выполненных калькулятором
     */
    private long countOperation = 0;

    /**
     * Конструктор класса CalculatorWithCounterAutoChoiceAgregation
     * передает в класс объект типа CalculatorWithOperator, с помощью
     * которого будут проводиться математические операции
     *
     * @param calc - экземпляр класса CalculatorWithOperator
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc) {
        calcWithOperator = calc;
    }

    /**
     * Конструктор класса CalculatorWithCounterAutoChoiceAgregation
     * передает в класс объект типа CalculatorWithMathCopy, с помощью
     * которого будут проводиться математические операции
     *
     * @param calc - экземпляр класса CalculatorWithMathCopy
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc) {
        calcWithMathCopy = calc;
    }

    /**
     * Конструктор класса CalculatorWithCounterAutoChoiceAgregation
     * передает в класс объект типа CalculatorWithMathExtends, с помощью
     * которого будут проводиться математические операции
     *
     * @param calc - экземпляр класса CalculatorWithMathExtends
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc) {
        calcWithMathExtends = calc;
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
     * Метод делит одно число на другое с помощью экземпляра класса, переданного в конструктор
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - числитель
     * @param y - знаменатель
     * @return результат деления x на y
     */
    public double divide(double x, double y) {
        countOperation++;
        if(calcWithOperator != null) {
            return calcWithOperator.divide(x,y);
        } else if(calcWithMathCopy != null) {
            return calcWithMathCopy.divide(x,y);
        } else {
            return calcWithMathExtends.divide(x,y);
        }
    }

    /**
     * Метод умножает одно число на другое с помощью экземпляра класса, переданного в конструктор
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - первый множитель
     * @param y - второй множитель
     * @return результат умножения x на y
     */
    public double multiply(double x, double y) {
        countOperation++;
        if(calcWithOperator != null) {
            return calcWithOperator.multiply(x,y);
        } else if(calcWithMathCopy != null) {
            return calcWithMathCopy.multiply(x,y);
        } else {
            return calcWithMathExtends.multiply(x,y);
        }
    }

    /**
     * Метод складывает одно число с другим с помощью экземпляра класса, переданного в конструктор
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - первое слогаемое
     * @param y - второе слогаемое
     * @return результат сложения x и y
     */
    public double sum(double x, double y) {
        countOperation++;
        if(calcWithOperator != null) {
            return calcWithOperator.sum(x,y);
        } else if(calcWithMathCopy != null) {
            return calcWithMathCopy.sum(x,y);
        } else {
            return calcWithMathExtends.sum(x,y);
        }
    }

    /**
     * Метод отнимает от одного числа другое с помощью экземпляра класса, переданного в конструктор
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - уменьшаемое
     * @param y - вычитаемое
     * @return результат вычитания y из x
     */
    public double subtract(double x, double y) {
        countOperation++;
        if(calcWithOperator != null) {
            return calcWithOperator.subtract(x,y);
        } else if(calcWithMathCopy != null) {
            return calcWithMathCopy.subtract(x,y);
        } else {
            return calcWithMathExtends.subtract(x,y);
        }
    }

    /**
     * Метод возводит дробное число в степень с помощью экземпляра класса, переданного в конструктор
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - число, которое нужно возвести
     * @param y - степень возведения
     * @return результат возведения числа x в степень y
     */
    public double pow(double x, int y) {
        countOperation++;
        if(calcWithOperator != null) {
            return calcWithOperator.pow(x,y);
        } else if(calcWithMathCopy != null) {
            return calcWithMathCopy.pow(x,y);
        } else {
            return calcWithMathExtends.pow(x,y);
        }
    }

    /**
     * Метод возвращает модуль числа с помощью экземпляра класса, переданного в конструктор
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - число, которое нужно вернуть по модулю
     * @return модуль числа x
     */
    public int abs(int x) {
        countOperation++;
        if(calcWithOperator != null) {
            return calcWithOperator.abs(x);
        } else if(calcWithMathCopy != null) {
            return calcWithMathCopy.abs(x);
        } else {
            return calcWithMathExtends.abs(x);
        }
    }

    /**
     * Метод вычисляет квадратный корень из числа с помощью экземпляра класса, переданного в конструктор
     * и увеличивает счетчик выполненных операций калькулятором на 1
     *
     * @param x - число, из которого нужно вычислить квадратный корень
     * @return квадратный корень числа x
     */
    public double sqrt(int x) {
        countOperation++;
        if(calcWithOperator != null) {
            return calcWithOperator.sqrt(x);
        } else if(calcWithMathCopy != null) {
            return calcWithMathCopy.sqrt(x);
        } else {
            return calcWithMathExtends.sqrt(x);
        }
    }
}
