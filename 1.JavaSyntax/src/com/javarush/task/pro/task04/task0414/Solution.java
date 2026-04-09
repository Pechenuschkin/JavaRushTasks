package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int count = scanner.nextInt();

        do {
            count--;
            System.out.println(number);

            if ( count <= 0 || count >= 4){
                break;
            }
        }
        while (true);

    }
}