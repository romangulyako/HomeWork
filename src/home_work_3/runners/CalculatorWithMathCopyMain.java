package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

        double result = calc.sum(calc.sum(4.1,calc.multiply(15,7)), calc.pow(calc.divide(28,5), 2));

        System.out.println(result);
    }
}
