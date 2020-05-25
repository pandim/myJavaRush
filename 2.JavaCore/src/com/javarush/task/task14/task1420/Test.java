package com.javarush.task.task14.task1420;

/*
НОД
*/

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a > 0 && b > 0) {

            int[] list = new int[a];
            int[] list2 = new int[b];

            for (int i = 0; i <= a; i++) {
                i = list[i];
                System.out.println("Значение i: " + i);
            }
            for (int i = 0; i <= b; i++) {
                i = list2[i];
            }
            if (a > b) {
                for (int i = b; i <= b; i--) {
                    if (list[i] == list2[i - (a - b)]) {
                        System.out.println(list[i]);
                        break;
                    }
                }
            } else if (b > a) {
                for (int i = a; i <= a; i--) {
                    if (list[i - (b - a)] == list2[i]) {
                        System.out.println(list[i]);
                        break;
                    }
                }
            }
        }
        else throw new Exception();



    }
}
