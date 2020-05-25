package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<>(map.values());
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) removeItemFromMapByValue(map, list.get(i));
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }


    public static void main(String[] args) {

    }
}
