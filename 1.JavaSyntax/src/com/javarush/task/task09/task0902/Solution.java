package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement[2].getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement[2].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();

        return stackTraceElement[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method5() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        //напишите тут ваш код

            return stackTraceElement[2].getMethodName();

        }

}
//    Задачка может слегка запутать, но стоит помнить, что из из стека можно забрать первым элемент
//    который пришел в него последним. Следовательно когда вы записываете стек в массив, то записывает
//    он их в обратном порядке от вызова и считает в том числе метод getMethodName().
//    Поэтому порядок в массиве будет таким:
//        0 - getMethodName()
//        1 - метод из которого был вызван getMethodName()
//        2 - метод который вызвал метод из которого был вызван getMethodName()
//        3 - метод который вызвал метод который вызвал метод...