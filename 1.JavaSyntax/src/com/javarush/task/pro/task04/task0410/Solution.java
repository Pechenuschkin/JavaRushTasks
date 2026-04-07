package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < min) {
                min1 = min;
                min = number;
            } else if (min < number && number < min1){
                min1 = number;
            }
        }
        System.out.println(min1);
    }
}