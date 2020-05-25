package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        String string;
        for (int i = 0; i < strings.size(); ) {
            string = strings.get(i);
            if ((string.indexOf("л") < 0) & (string.indexOf("р") >= 0)) {
                strings.remove(i);
            }
            else if ((string.indexOf("л") >= 0) & (string.indexOf("р") < 0)) {
                strings.add(i + 1, string);
                i += 2;
            }
            else i++;
        }
            return strings;

    }
}