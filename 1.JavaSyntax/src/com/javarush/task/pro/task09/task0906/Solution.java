package com.javarush.task.pro.task09.task0906;



/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишите тут ваш код
        if (decimalNumber <= 0) {
            return "";
        }
        String string = "";
        int binaryNumber = 0;
        while (decimalNumber != 0) {
            binaryNumber = (decimalNumber % 2);
            decimalNumber = decimalNumber / 2;
            string = string + String.valueOf(binaryNumber);
        }
        String string1 = "";
        char[] arr = string.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            string1 = string1 + arr[i];
        }
        return string1;

    }

    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        if (binaryNumber == null || binaryNumber.equals("")) {
            return 0;
        }
        int decimalNumber = 0;
        int power = binaryNumber.length();
        for (int i = 0; i < binaryNumber.length(); i++) {
            power--;
            if (binaryNumber.charAt(i) == '1') {
                decimalNumber = decimalNumber + (int) Math.pow(2, power);
            }
        }
        return decimalNumber;
    }
}
