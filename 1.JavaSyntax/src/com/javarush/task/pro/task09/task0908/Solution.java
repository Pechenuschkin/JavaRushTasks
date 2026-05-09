package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";
    private static final String[] BINARY =
            {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                    "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {

        if (binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[01]+")) {
            return "";
        }

        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }

        String hexNumber = "";
        for (int i = 0; i < binaryNumber.length(); i = i + 4) {
            for (int j = 0; j < BINARY.length; j++) {
                if (binaryNumber.substring(i, i + 4).equals(BINARY[j])) {
                    hexNumber += String.valueOf(HEX.charAt(j));
                }
            }

        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty() || !hexNumber.matches("[1-9a-f]+")){
            return "";
        }

        String binaryNumber = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            for (int j = 0; j < HEX.length(); j++) {
                if(hexNumber.charAt(i) == HEX.charAt(j)){
                    binaryNumber += BINARY[j];
                }
            }
        }
            return binaryNumber;
    }

    public static String toHex1(String binaryNumber) {
        //напишите тут ваш код

        if (binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[01]+")) {
            return "";
        }


        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;

        }

        String hexNumber = "";
        for (int i = 0; i < binaryNumber.length(); i = i + 4) {
            String oneHex = "";
            String fourBit = binaryNumber.substring(i, i + 4);
            if (fourBit.equals("0000")) {
                oneHex = "0";
            } else if (fourBit.equals("0001")) {
                oneHex = "1";
            } else if (fourBit.equals("0010")) {
                oneHex = "2";
            } else if (fourBit.equals("0011")) {
                oneHex = "3";
            } else if (fourBit.equals("0100")) {
                oneHex = "4";
            } else if (fourBit.equals("0101")) {
                oneHex = "5";
            } else if (fourBit.equals("0110")) {
                oneHex = "6";
            } else if (fourBit.equals("0111")) {
                oneHex = "7";
            } else if (fourBit.equals("1000")) {
                oneHex = "8";
            } else if (fourBit.equals("1001")) {
                oneHex = "9";
            } else if (fourBit.equals("1010")) {
                oneHex = "a";
            } else if (fourBit.equals("1011")) {
                oneHex = "b";
            } else if (fourBit.equals("1100")) {
                oneHex = "c";
            } else if (fourBit.equals("1101")) {
                oneHex = "d";
            } else if (fourBit.equals("1110")) {
                oneHex = "e";
            } else if (fourBit.equals("1111")) {
                oneHex = "f";
            }
            hexNumber += oneHex;
        }
        return hexNumber;
    }

    public static String toBinary1(String hexNumber) {
        //напишите тут ваш код
        if (hexNumber == null || hexNumber.isEmpty() || !hexNumber.matches("[0-9a-f]+")) {
            return "";
        }
        String binaryNumber = "";
        for (char aChar : hexNumber.toCharArray()) {
            String fourBit = "";
            if (aChar == '0') {
                fourBit = "0000";
            } else if (aChar == '1') {
                fourBit = "0001";
            } else if (aChar == '2') {
                fourBit = "0010";
            } else if (aChar == '3') {
                fourBit = "0011";
            } else if (aChar == '4') {
                fourBit = "0100";
            } else if (aChar == '5') {
                fourBit = "0101";
            } else if (aChar == '6') {
                fourBit = "0110";
            } else if (aChar == '7') {
                fourBit = "0111";
            } else if (aChar == '8') {
                fourBit = "1000";
            } else if (aChar == '9') {
                fourBit = "1001";
            } else if (aChar == 'a') {
                fourBit = "1010";
            } else if (aChar == 'b') {
                fourBit = "1011";
            } else if (aChar == 'c') {
                fourBit = "1100";
            } else if (aChar == 'd') {
                fourBit = "1101";
            } else if (aChar == 'e') {
                fourBit = "1110";
            } else if (aChar == 'f') {
                fourBit = "1111";
            }
            binaryNumber += fourBit;
        }
        return binaryNumber;
    }
}
