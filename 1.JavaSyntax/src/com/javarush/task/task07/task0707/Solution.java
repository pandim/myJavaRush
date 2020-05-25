package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Раз ");
        list.add("Два ");
        list.add("Три ");
        list.add("Четыре ");
        list.add("Пять");

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
