package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> source = new ArrayList<Integer>();
        ArrayList<Integer> div3 = new ArrayList<Integer>();
        ArrayList<Integer> div2 = new ArrayList<Integer>();
        ArrayList<Integer> notdiv = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            source.add(Integer.parseInt(reader.readLine()));
        }
        int sourceget = 0;
        for (int i = 0; i < source.size(); i++) {
            sourceget = source.get(i);
            if (sourceget % 3 == 0) div3.add(sourceget);
            if (sourceget % 2 == 0) div2.add(sourceget);
            if ((sourceget % 2 != 0) & (sourceget % 3 != 0)) notdiv.add(sourceget);
        }
        printList(div3);
        printList(div2);
        printList(notdiv);
    }
        public static void printList (ArrayList < Integer > list) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

}