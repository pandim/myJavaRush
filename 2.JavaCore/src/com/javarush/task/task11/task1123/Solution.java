package com.javarush.task.task11.task1123;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<>(null, null);
        }
//        int[] temp = Arrays.copyOf(inputArray, inputArray.length);
        int[] temp = inputArray.clone();
        Arrays.sort(temp);
        return new Pair<>(temp[0], temp[temp.length - 1]);


    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
