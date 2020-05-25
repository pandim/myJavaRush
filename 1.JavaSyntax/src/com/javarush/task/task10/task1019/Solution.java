package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        String tmp, name;
        int id;
        while (true) {
            tmp = reader.readLine();
            if (!(tmp.equals(""))) id = Integer.parseInt(tmp);
            else break;
            name = reader.readLine();
            map.put(name, id);
        }
        for (Map.Entry<String, Integer> k : map.entrySet()) {
            System.out.println(k.getValue() + " " + k.getKey());

        }
    }
}