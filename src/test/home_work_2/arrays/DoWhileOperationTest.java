package test.home_work_2.arrays;

import home_work_2.arrays.DoWhileOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoWhileOperationTest {
    int[] simpleArray = {1,2,3,4,5};
    int[] emptyArray = new int[0];
    int[] nullArray = null;

    String printToConsoleHead = "Печать всех элементов массива (do while)\n";
    String printEverySecondElementOfArrayHead = "Печать каждого второго элемента массива (do while)\n";
    String reversePrintingHead = "Печать массива наоборот (do while)\n";

    DoWhileOperation operator = new DoWhileOperation();

    @Test
    public void printToConsoleSimpleArrayTest() {
        String result = printToConsoleHead + "1, 2, 3, 4, 5";
        assertEquals(result, operator.printToConsole(simpleArray));
    }

    @Test
    public void printToConsoleEmptyArrayTest() {
        String result = "";
        assertEquals(result, operator.printToConsole(emptyArray));
    }

    @Test
    public void printToConsoleNullArrayTest() {
        String result = "";
        assertEquals(result, operator.printToConsole(nullArray));
    }

    @Test
    public void printEverySecondElementOfSimpleArrayTest() {
        String result = printEverySecondElementOfArrayHead + "1, 3, 5";
        assertEquals(result, operator.printEverySecondElementOfArray(simpleArray));
    }

    @Test
    public void printEverySecondElementOfEmptyArrayTest() {
        String result = "";
        assertEquals(result, operator.printEverySecondElementOfArray(emptyArray));
    }

    @Test
    public void printEverySecondElementOfNullArrayTest() {
        String result = "";
        assertEquals(result, operator.printEverySecondElementOfArray(nullArray));
    }

    @Test
    public void reversePrintingSimpleArrayTest() {
        String result = reversePrintingHead + "5, 4, 3, 2, 1";
        assertEquals(result, operator.reversePrinting(simpleArray));
    }


    @Test
    public void reversePrintingEmptyArrayTest() {
        String result = "";
        assertEquals(result, operator.reversePrinting(emptyArray));
    }

    @Test
    public void reversePrintingNullArrayTest() {
        String result = "";
        assertEquals(result, operator.reversePrinting(nullArray));
    }
}
