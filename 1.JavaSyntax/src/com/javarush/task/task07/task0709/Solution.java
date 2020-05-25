package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (i == 0) min = strings.get(i).length();
            if (strings.get(i).length() < min) min = strings.get(i).length();
        }
        for (String string : strings) {
            if (string.length() == min) System.out.println(string);

        }
    }
}
