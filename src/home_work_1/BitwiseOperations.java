package home_work_1;

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input x number: ");
        int x = input.nextInt();                        // 13 - 0000_1101
        System.out.print("Input y number: ");
        int y = input.nextInt();                        // 27 - 0001_1011
        input.close();
        int resultAnd = x & y;                          /*    0000_1101
                                                            & 0001_1011
                                                            -----------
                                                              0000_1001 - 9 */
        System.out.println("x & y = " + resultAnd);
        int resultOr = x | y;                           /*    0000_1101
                                                            | 0001_1011
                                                            -----------
                                                              0001_1111 - 31 */
        System.out.println("x | y = " + resultOr);
    }
}