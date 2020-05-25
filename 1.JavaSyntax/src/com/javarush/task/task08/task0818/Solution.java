package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
//        for (int i = 0; i < 20; i++) { set.add("Лум" + (char)(70+i));}
//        ( Math.random() * (b-a) ) + a
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) { map.put("Arma" + (char) (70+i),(int)(Math.random()*1500-0));}
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
//  map.entrySet().removeIf(entry -> ((entry.getValue().getMonth() > 4) & (entry.getValue().getMonth() < 8)));
        map.entrySet().removeIf(entry -> (entry.getValue() < 500));
    }

    public static void main(String[] args) {

    }
}