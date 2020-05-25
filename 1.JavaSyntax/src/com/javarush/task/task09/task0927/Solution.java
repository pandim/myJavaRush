package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        String[] cats = new String[]{"Васька", "Пушок", "Мурка", "Кузька",
                "Мурочка", "Хвост", "Буся", "Ариша", "Барбос", "Матроскин"};
//        for (int i = 0; i < cats.length; i++) {
//            map.put(cats[i], new Cat(cats[i]));
//        }

        for (String cat : cats) {
            map.put(cat, new Cat(cat));
        }
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
//        Set<Cat> set = new HashSet<>(map.values());
//        return set;

        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
