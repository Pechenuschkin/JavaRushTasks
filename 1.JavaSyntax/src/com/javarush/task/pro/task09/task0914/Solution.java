package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int number = path.indexOf("jdk");
        int number1 = path.indexOf("/", number + 3);
        String string = path.substring(0, number);
        String string1 = path.substring(number1);
        String result = string + jdk + string1;
        return result ;

    }
}
