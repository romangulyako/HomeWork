package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        // В переменную calc записываем объект класса CalculatorWithCounterAutoChoiceAgregation,
        // принимающий в конструктор экземпляр класса CalculatorWithOperator
        CalculatorWithCounterAutoChoiceAgregation calc = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());

        // Рассчет выражения с помощью экземпляра класса CalculatorWithOperator, переданного в конструктор
        double result = calc.sum(calc.sum(4.1,calc.multiply(15,7)), calc.pow(calc.divide(28,5), 2));

        System.out.println(result);
        System.out.println(calc.getCountOperation());

        // В переменную calc записываем новый объект класса CalculatorWithCounterAutoChoiceAgregation,
        // принимающий в конструктор экземпляр класса CalculatorWithMathCopy
        calc = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());

        // Рассчет выражения с помощью экземпляра класса CalculatorWithMathCopy, переданного в конструктор
        result = calc.sum(calc.sum(4.1,calc.multiply(15,7)), calc.pow(calc.divide(28,5), 2));

        System.out.println(result);
        System.out.println(calc.getCountOperation());

        // В переменную calc записываем новый объект класса CalculatorWithCounterAutoChoiceAgregation,
        // принимающий в конструктор экземпляр класса CalculatorWithMathExtends
        calc = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());

        // Рассчет выражения с помощью экземпляра класса CalculatorWithMathExtends, переданного в конструктор
        result = calc.sum(calc.sum(4.1,calc.multiply(15,7)), calc.pow(calc.divide(28,5), 2));

        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
