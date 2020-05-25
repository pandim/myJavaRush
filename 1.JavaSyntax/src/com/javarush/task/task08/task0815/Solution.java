package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Ионов", "Андрей");
        map.put("Петров", "Сергей");
        map.put("Поляков", "Николай");
        map.put("Пушин", "Игорь");
        map.put("Павлов", "Иван");
        map.put("Сидоров", "Евгений");
        map.put("Соков", "Сергей");
        map.put("Сомов", "Иван");
        map.put("Суев", "Андрей");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int k = 0;
        for (Map.Entry entry : map.entrySet()) {if (entry.getValue() == name) k++;}
        return k;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        if (map.containsKey(lastName)) return 1; else return 0;
    }

    public static void main(String[] args) {

//        Map<String, String> map = new HashMap<>();
//        map = createMap();
    }
}
