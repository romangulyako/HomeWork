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

        binaryNum = convertToDirectCode(number);

        if (number < 0) {
            String reverseCode = convertToReverseCode(binaryNum);
            binaryNum = convertToAdditionalCode(reverseCode);
        }

        return binaryNum;
    }

    public static String convertToDirectCode(byte number) {
        String directCode = "";

        // в переменную tmpNumber записываем переданное число по модулю. Это нужно, чтобы корректно перевести отрицательное число в прямой код
        int tmpNumber = Math.abs(number);
        // перевод числа в прямой код
        for (int i = 0; i < 8; i++) {
            directCode = tmpNumber % 2 + directCode;
            tmpNumber /= 2;
        }
        return directCode;
    }

    public static String convertToReverseCode(String directCode) {
        // записываем строку с двоичным представлением числа в массив символов, для посимвольной обработки
        char[] directCodeArr = directCode.toCharArray();
        char[] reverseCodeArr = new char[8];
        StringBuilder reverseCode= new StringBuilder();

        // вычисление обратного кода
        for (int i = 0; i < directCodeArr.length; i++) {
            if (directCodeArr[i] == '1') {
                reverseCodeArr[i] = '0';
            }
            else {
                reverseCodeArr[i] = '1';
            }
            reverseCode.append(reverseCodeArr[i]);
        }

        return reverseCode.toString();
    }

    public static String convertToAdditionalCode(String reverseCode) {
        // вычисление дополнительного кода
        char[] additionalCodeArr = reverseCode.toCharArray();
        for (int i = 7; i >= 0; i--) {
            if (additionalCodeArr[i] == '1') {
                additionalCodeArr[i] = '0';
            }
            else {
                additionalCodeArr[i] = '1';
                break;
            }
        }

        StringBuilder additionalCode = new StringBuilder();

        for (char c : additionalCodeArr) {
            additionalCode.append(c);
        }

        return additionalCode.toString();
    }
}

