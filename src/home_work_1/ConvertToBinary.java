package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        byte decNum = input.nextByte();
        input.close();

        System.out.println(decNum + " = " + toBinaryString(decNum));
    }

    public static String toBinaryString(byte number) {
        String binaryNum = "";

        // в переменную tmpNumber записываем переданное число по модулю. Это нужно, чтобы корректно перевести отрицательное число в прямой код
        int tmpNumber = Math.abs(number);
        // перевод числа в прямой код
        for (int i = 0; i < 8; i++) {
            binaryNum = tmpNumber % 2 + binaryNum;
            tmpNumber /= 2;
        }

        // если число отрицательное, то выполняется блок кода по вычислению его обратного и затем дополнительного кода
        if (number < 0) {
            // записываем строку с двоичным представлением числа в массив символов, для посимвольной обработки
            char[] directCode = binaryNum.toCharArray();
            char[] reverseCode = new char[8];

            // вычисление обратного кода
            for (int i = 0; i < directCode.length; i++) {
                if (directCode[i] == '1') {
                    reverseCode[i] = '0';
                }
                else {
                    reverseCode[i] = '1';
                }
            }

            // вычисление дополнительного кода
            char[] additionalCode = Arrays.copyOf(reverseCode,reverseCode.length);
            for (int i = 7; i >= 0; i--) {
                if (reverseCode[i] == '1') {
                    additionalCode[i] = '0';
                }
                else {
                    additionalCode[i] = '1';
                    break;
                }
            }
            // записываем получившийся массив с обратным кодом в возвращаемую строку
            binaryNum = new String(additionalCode);
        }
        return binaryNum;
        }
    }

