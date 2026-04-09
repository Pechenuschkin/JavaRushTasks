package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишите тут ваш код
        int glass1 = 0;
        Scanner scanner = new Scanner(System.in);
        boolean cup = scanner.nextBoolean();
        if (cup == true){
          glass1 =  (int)Math.ceil(glass);
        } else if (cup == false){
           glass1 = (int)Math.floor(glass);
        }
        System.out.println(glass1);
    }
}