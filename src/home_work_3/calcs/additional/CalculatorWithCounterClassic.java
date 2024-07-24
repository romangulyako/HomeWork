package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    /**
     * Поле, хранящее количество операций, выполненных калькулятором
     */
    private long countOperation = 0;

    /**
     * Метод увеличивает поле countOperation на 1
     */
    public void incrementCountOperation() {
        countOperation++;
    }

    /**
     * Метод возвращет количество операций, выполненных калькулятором
     *
     * @return поле countOperation
     */
    public long getCountOperation() {
        return countOperation;
    }
}
