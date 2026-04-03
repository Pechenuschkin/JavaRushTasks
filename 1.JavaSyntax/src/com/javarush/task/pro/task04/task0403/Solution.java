package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
           if (scanner.hasNextInt()) {
               int number = scanner.nextInt();
               sum = sum + number;
           } else if (scanner.hasNextLine()){
              String string = scanner.nextLine();
              if (string.equals("ENTER")){
                  break;
              }
           }
        }
        System.out.println(sum);
    }
}