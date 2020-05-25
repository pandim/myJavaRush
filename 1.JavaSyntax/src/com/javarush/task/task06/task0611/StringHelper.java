package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        result = multiply(s, 5);
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        result = new String(new char[count]).replace("\0", s);
        return result;
    }

    public static void main(String[] args) {

    }
}
