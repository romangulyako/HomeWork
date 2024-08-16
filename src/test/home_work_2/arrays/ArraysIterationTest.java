package test.home_work_2.arrays;

import home_work_2.arrays.ArraysIteration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysIterationTest {
    int[] simpleArray = {1,2,3,4,5};
    int[] emptyArray = new int[0];
    int[] nullArray = null;

    String doWhileHead = "Печать с помощью do...while\n";
    String whileHead = "Печать с помощью while\n";
    String forHead = "Печать с помощью for\n";
    String foreachHead = "Печать с помощью foreach\n";

    @Test
    public void printToConsoleSimpleArrayTest() {
        String result = doWhileHead + "1, 2, 3, 4, 5\n" +
                whileHead + "1, 2, 3, 4, 5\n" +
                forHead + "1, 2, 3, 4, 5\n" +
                foreachHead + "1, 2, 3, 4, 5";
        assertEquals(result, ArraysIteration.printToConsole(simpleArray));
    }

    @Test
    public void printToConsoleEmptyArrayTest() {
        String result = "";
        assertEquals(result, ArraysIteration.printToConsole(emptyArray));
    }

    @Test
    public void printToConsoleNullArrayTest() {
        String result = "";
        assertEquals(result, ArraysIteration.printToConsole(nullArray));
    }

    @Test
    public void printEverySecondElementOfSimpleArrayTest() {
        String result = doWhileHead + "1, 3, 5\n" +
                whileHead + "1, 3, 5\n" +
                forHead + "1, 3, 5\n" +
                foreachHead + "1, 3, 5";
        assertEquals(result, ArraysIteration.printEverySecondElementOfArray(simpleArray));
    }

    @Test
    public void printEverySecondElementOfEmptyArrayTest() {
        String result = "";
        assertEquals(result, ArraysIteration.printEverySecondElementOfArray(emptyArray));
    }

    @Test
    public void printEverySecondElementOfNullArrayTest() {
        String result = "";
        assertEquals(result, ArraysIteration.printEverySecondElementOfArray(nullArray));
    }

    @Test
    public void reversePrintingSimpleArrayTest() {
        String result = doWhileHead + "5, 4, 3, 2, 1\n" +
                whileHead + "5, 4, 3, 2, 1\n" +
                forHead + "5, 4, 3, 2, 1\n" +
                foreachHead + "5, 4, 3, 2, 1";
        assertEquals(result, ArraysIteration.reversePrinting(simpleArray));
    }


    @Test
    public void reversePrintingEmptyArrayTest() {
        String result = "";
        assertEquals(result, ArraysIteration.reversePrinting(emptyArray));
    }

    @Test
    public void reversePrintingNullArrayTest() {
        String result = "";
        assertEquals(result, ArraysIteration.reversePrinting(nullArray));
    }
}
