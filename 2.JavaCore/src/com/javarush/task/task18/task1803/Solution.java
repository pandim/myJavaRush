package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        Integer k;
        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available() > 0) {
            if (map.containsKey(k = inputStream.read())) {
                map.put(k, map.get(k) + 1);
            } else {
                map.put(k, 1);
            }
        }

        inputStream.close();
        Integer max = null;
        for (int values : map.values()) {
            if (max == null) max = values;
            else if (values > max) max = values;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) System.out.print(entry.getKey() + " ");
        }
    }
}

