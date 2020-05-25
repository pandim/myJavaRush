package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            while (true) {
                list.add(Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException | IOException e) {
            for (Integer i : list)
                System.out.println(i);
        }
    }

}

