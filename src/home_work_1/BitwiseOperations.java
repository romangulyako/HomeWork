package home_work_1;

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input X number: ");
        int x = input.nextInt();                        // 13 - 0000_1101
        System.out.print("Input Y number: ");
        int y = input.nextInt();                        // 27 - 0001_1011
        input.close();

        System.out.println("x & y = " + bitwiseAnd(x,y));       /*    0000_1101
                                                            & 0001_1011
                                                            -----------
                                                              0000_1001 - 9 */

        System.out.println("x | y = " + bitwiseOr(x,y));       /*    0000_1101
                                                            | 0001_1011
                                                            -----------
                                                              0001_1111 - 31 */
    }

    public static int bitwiseOr(int x, int y) {
        return x | y;
    }

    public static int bitwiseAnd(int x, int y) {
        return x & y;
    }
}