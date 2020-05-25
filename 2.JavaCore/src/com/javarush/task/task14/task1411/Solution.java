package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// -------- Вариант, прошедший валидатор -------------------------
//        Person person = null;
//        String key = null;
//while (true){
//    switch (key = reader.readLine()){
//        case "user": doWork(person = new Person.User());break;
//        case "loser": doWork(person = new Person.Loser());break;
//        case "coder": doWork(person = new Person.Coder());break;
//        case "proger": doWork(person = new Person.Proger());break;
//        default: return;
//    }
// -------------- Идее нравится, валидатором не проверял ----------
//        Person person = null;
//        String key = null;
        while (true){
            switch (reader.readLine()){
                case "user": doWork(new Person.User());break;
                case "loser": doWork(new Person.Loser());break;
                case "coder": doWork(new Person.Coder());break;
                case "proger": doWork(new Person.Proger());break;
                default: return;
            }
        }

    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) ((Person.User) person).live();
        if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        if (person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
