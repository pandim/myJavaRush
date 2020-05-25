package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        while (true) {
            set.add((int) (Math.random() * (30)));
            if (set.size() == 20) break;
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
//        for (int i : set) {
//            if (i > 10) set.remove(i);
//        }

//        set.removeIf(Integer -> Integer > 10);
//        return set;

        set.removeIf(integer -> integer > 10);
        return set;
    }

    public static void main(String[] args) {
//        Set<Integer> s = new HashSet<>();
//        s = createSet();
//        s = removeAllNumbersGreaterThan10(s);
    }
}
