package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
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

        Integer min = null;
        for (int values : map.values()) {
            if (min == null) min = values;
            else if (values < min) min = values;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) System.out.print(entry.getKey() + " ");
        }
    }
}

