package com.javarush.task.pro.task05.task0508;

import java.util.Objects;
import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            int number = 0;
            for (int j = 0; j < strings.length; j++) {
                if (strings[i] != null && strings[j] != null) {
                    if (strings[i].equals(strings[j]) && i != j) {
                        strings[j] = null;
                        ++number;
                    }
                }
            }
            if (number > 0) {
                strings[i] = null;
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
