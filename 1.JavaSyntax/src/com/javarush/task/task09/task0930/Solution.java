package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
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
        String[] array = list.toArray(new String[list.size()]);
//      или так
//        String[] array = list.toArray(new String[0]);

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> iList = new ArrayList<>();
        ArrayList<String> sList = new ArrayList<>();
        for (String s : array) {
            if (isNumber(s)) iList.add(Integer.parseInt(s));
            else sList.add(s);
        }
        Collections.sort(iList, Collections.reverseOrder());

        for (int i = sList.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (isGreaterThan(sList.get(j), sList.get(j + 1))) { //для сортировки по возрастанию - поменять знак
                    String tmp = sList.get(j);
                    sList.set(j, sList.get(j + 1));
                    sList.set(j + 1, tmp);
                }
            }
        }
        int indexI = -1, indexS = -1;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
//                result.add(String.valueOf(iList.get(indexI + 1)));
                array[i] = String.valueOf(iList.get(indexI + 1));
                indexI++;
            } else {
//                result.add(sList.get(indexS + 1));
                array[i] = sList.get(indexS + 1);
                indexS++;
            }

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
