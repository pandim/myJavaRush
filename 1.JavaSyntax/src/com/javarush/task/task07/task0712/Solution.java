package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<>();
        int min = 0, max = 0, minpos = 0, maxpos = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len;
        for (int i = 0; i < 10; i++) {
            array.add(reader.readLine());
            len = array.get(i).length();
            if (i == 0) min = len;
            if (len < min) {min = len; minpos = i;}
            if (len > max) {max = len; maxpos = i;}
        }
        if (minpos < maxpos) System.out.println(array.get(minpos));
        if (minpos > maxpos) System.out.println(array.get(maxpos));
    }
}
