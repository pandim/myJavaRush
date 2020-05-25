package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> months = new ArrayList<String>();
        months = Arrays.asList(new String[] {"January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"});
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        System.out.println(month + " is the " + (months.indexOf(month)+1) + " month");
    }

}

