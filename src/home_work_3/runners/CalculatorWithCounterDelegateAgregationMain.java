package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());

        double result = calc.sum(calc.sum(4.1,calc.multiply(15,7)), calc.pow(calc.divide(28,5), 2));

        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
