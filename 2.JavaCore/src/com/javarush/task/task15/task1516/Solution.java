package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.intVar +"\n" + a.doubleVar +"\n" + a.DoubleVar + "\n"
                + a.booleanVar +"\n" + a.ObjectVar +"\n" + a.ExceptionVar +"\n"
                + a.StringVar);
    }
}
