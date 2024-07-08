package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class InterfaceTest {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayRandom(7,50);
        DoWhileOperation objectDoWhile = new DoWhileOperation();

        System.out.println(objectDoWhile.printToConsole(array));
        System.out.println(objectDoWhile.printEverySecondElementOfArray(array));
        System.out.println(objectDoWhile.reversePrinting(array));
        System.out.println("---------------------------------------------------");

        WhileOperation objectWhile = new WhileOperation();

        System.out.println(objectWhile.printToConsole(array));
        System.out.println(objectWhile.printEverySecondElementOfArray(array));
        System.out.println(objectWhile.reversePrinting(array));
        System.out.println("---------------------------------------------------");

        ForOperation objectFor = new ForOperation();

        System.out.println(objectFor.printToConsole(array));
        System.out.println(objectFor.printEverySecondElementOfArray(array));
        System.out.println(objectFor.reversePrinting(array));
        System.out.println("---------------------------------------------------");

        ForEachOperation objectForEach = new ForEachOperation();

        System.out.println(objectForEach.printToConsole(array));
        System.out.println(objectForEach.printEverySecondElementOfArray(array));
        System.out.println(objectForEach.reversePrinting(array));
    }
}
