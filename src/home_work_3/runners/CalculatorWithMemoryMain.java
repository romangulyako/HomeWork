package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        CalculatorWithMemory calcWithMemory = new CalculatorWithMemory(calculator);

        calcWithMemory.divide(28, 5);
        calcWithMemory.saveResultOfOperation();

        calcWithMemory.pow(calcWithMemory.loadFromMemory(), 2);
        calcWithMemory.saveResultOfOperation();

        calcWithMemory.sum(4.1, calcWithMemory.loadFromMemory());
        calcWithMemory.saveResultOfOperation();

        calcWithMemory.sum(calcWithMemory.loadFromMemory(), calcWithMemory.multiply(15, 7));
        calcWithMemory.saveResultOfOperation();

        System.out.println(calcWithMemory.loadFromMemory());
    }
}
