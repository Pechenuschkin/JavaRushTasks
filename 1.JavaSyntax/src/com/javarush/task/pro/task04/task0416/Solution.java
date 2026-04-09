package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
         int number2 = scanner.nextInt();
         double number3 = number1 * 1.0 / number2;
        System.out.println(number3);
    }
}