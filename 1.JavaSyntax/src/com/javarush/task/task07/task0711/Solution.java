package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) { array.add(reader.readLine());}
        String s = "";
        for (int i = 0; i < 13; i++) {
        s = array.get(array.size()-1);
        array.add(0, s);
        array.remove(array.size()-1);
        }
        for (String a:array) {
            System.out.println(a);

        }
    }
}
