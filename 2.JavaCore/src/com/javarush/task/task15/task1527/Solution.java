package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] strings = string.substring(string.indexOf("?") + 1).split("&");
        int k;
        String key = "", value = "", keyString = "";
        for (String str : strings) {
            if ((k = str.indexOf("=")) >= 0) {
                key = str.substring(0, k);
            } else key = str;
            if (key.equals("obj")) value = str.substring(k+1);
            keyString += (key + " ");
        }
        System.out.println(keyString.trim());
        if (!value.equals("")) {
            try {
                alert(Double.parseDouble(value));
            } catch (Exception e) {
                alert(value);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
