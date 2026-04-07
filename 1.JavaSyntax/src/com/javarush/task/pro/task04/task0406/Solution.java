package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        while (true){
            String string = scanner.nextLine();
            if (string.equals("enough")){
                break;
            } else {
                System.out.println(string);
            }
        }

    }
}