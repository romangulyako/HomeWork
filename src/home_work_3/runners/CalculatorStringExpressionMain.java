package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorStringExpression;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorStringExpressionMain {
    public static void main(String[] args) {
        CalculatorStringExpression calc = new CalculatorStringExpression(new CalculatorWithMathExtends());
        String expresion = "4.1 + 15 * 7 + (28.0 / 5)^ 2";

        if (calc.validation(expresion)) {
            System.out.println(expresion + " = " + calc.calculate(expresion));
        } else {
            System.out.println("Неверный формат ввода!");
        }
    }
}
