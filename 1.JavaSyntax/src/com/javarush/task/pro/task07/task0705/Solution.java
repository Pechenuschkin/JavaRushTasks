package com.javarush.task.pro.task07.task0705;

/* 
Бесконечность — не предел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double a = 0.0;
        double b = 1.0;
        div(a, b);
        b = -1.0;
        div(a, b);

    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
