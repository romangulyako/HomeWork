package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        double result = calc.sum(calc.sum(4.1,calc.multiply(15,7)), calc.pow(calc.divide(28,5), 2));

        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
