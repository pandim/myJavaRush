package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
//         try{
//        ArrayList<Integer> c = new ArrayList<>();
//        c.add("10");
//        } catch (Exception e){exceptions.add(e);}
//        try {
//            float i = 1 / 0;
//
//        } catch (Exception e) {
//            exceptions.add(e);
//        }
//        try{
//            int[] a = {1,2,3};
//            int b = a[3];
//        } catch (Exception e){exceptions.add(e);}
        exceptions.add(new ArithmeticException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new NullPointerException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new NegativeArraySizeException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ClassCastException());
        exceptions.add(new StringIndexOutOfBoundsException());
        exceptions.add(new IllegalArgumentException());
    }
}
