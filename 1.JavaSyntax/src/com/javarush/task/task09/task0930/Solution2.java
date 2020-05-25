package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/*
Задача по алгоритмам
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        List<Integer> arrayInteger = new ArrayList<>();
        List<String> arrayString = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        for (String string: array) {
            if (isNumber(string)) arrayInteger.add(Integer.parseInt(string));
            else arrayString.add(string);
        }
        Collections.sort(arrayInteger, Collections.reverseOrder());

        for (int i = arrayString.size() - 1; i > 0; i--) {
            for (int j = 0; j < arrayString.size(); j++) {
                if (isGreaterThan(array[j], array[j + 1])) { //для сортировки по возрастанию - поменять знак
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;}}}
        Iterator<Integer> iteratorI = arrayInteger.iterator();
        Iterator<String> iteratorS = arrayString.iterator();

        for (String string:array) {
            if (isNumber(string)) {iteratorI.next(); }
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
