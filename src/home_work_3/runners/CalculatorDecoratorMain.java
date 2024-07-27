package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        //ICalculator calc = new CalculatorWithCounterClassic();

        double result = calc.sum(calc.sum(4.1,calc.multiply(15,7)), calc.pow(calc.divide(28,5), 2));

        System.out.println(result);

        /*
         * Оператор instanceof помогает узнать принадлежность объекта к классу. В данной задаче он помогает решить следующую проблему -
         * если мы поменяем калькулятор (как в строке 12 - назначим переменной calc ссылку на экземпляр любого другого класса, реализующего калькулятор),
         * то при запуске программы не будет ошибки, а просто та часть кода, для которой необходимы экземпляры конкретных классов, просто
         * не выполнится.
         */
        if(calc instanceof CalculatorWithCounterAutoDecorator) {
            System.out.println(((CalculatorWithCounterAutoDecorator) calc).getCountOperation());

            ICalculator nestedCalc = ((CalculatorWithCounterAutoDecorator) calc).getCalculator();

            if(nestedCalc instanceof CalculatorWithMemoryDecorator) {
                ((CalculatorWithMemoryDecorator) nestedCalc).saveResultOfOperation();
                System.out.println(((CalculatorWithMemoryDecorator) nestedCalc).loadFromMemory());
            }
        }
    }
}
