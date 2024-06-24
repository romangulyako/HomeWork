package home_work_1;

import java.util.Scanner;

public class ConvertToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        byte decNum = input.nextByte();
        System.out.println(decNum + " = " + toBinaryString(decNum));
        input.close();
    }

    public static String toBinaryString(byte number) {
        String binaryNum = "";
        if (number == Byte.MIN_VALUE) {
            return "10000000";
        }
        // в переменную tmpNumber записываем число по модулю. Это нужно, чтобы корректно перевести отрицательное число
        int tmpNumber = Math.abs(number);
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
            char[] additionalCode = reverseCode;
            for (int i = 7; i >= 0; i--) {
                if (reverseCode[i] == '1') {
                    additionalCode[i] = '0';
                }
                else {
                    additionalCode[i] = '1';
                    break;
                }
            }
            binaryNum = new String(additionalCode);
        }
        return binaryNum;
        }
    }

