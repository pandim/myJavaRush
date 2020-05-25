package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ch = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (ch < strings.get(i).length()) ch = strings.get(i).length();
        }
        for (String string : strings) {
            if (string.length() == ch) System.out.println(string);

        }
    }
}
