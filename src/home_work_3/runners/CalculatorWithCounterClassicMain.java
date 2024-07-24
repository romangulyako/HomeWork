package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        double intermediateExpression = calc.multiply(15,7);
        calc.incrementCountOperation();

        double result = calc.sum(4.1,intermediateExpression);
        calc.incrementCountOperation();

        intermediateExpression =  calc.divide(28,5);
        calc.incrementCountOperation();

        intermediateExpression = calc.pow(intermediateExpression,2);
        calc.incrementCountOperation();

        result = calc.sum(result,intermediateExpression);
        calc.incrementCountOperation();

        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
