package home_work_1;

import java.util.Scanner;

public class BitwiseOperationsWithLiteral {
    public static void main(String[] args) {
        double x = 42.5;
        Scanner input = new Scanner(System.in);
        System.out.print("Input y number: ");
        int y = input.nextInt();                    // 13 - 0000_1101
        input.close();
        //int resultAnd = x & y;                    // в Java побитовые операции можно осуществлять только с целочисленными типами данных,
        //int resultOr = x | y;                     // поэтому решение данной задачи невозможно.


    }
}
