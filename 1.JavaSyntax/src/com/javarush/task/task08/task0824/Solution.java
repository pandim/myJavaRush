package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Human Vitya = new Human("Витя", true,4,new ArrayList<Human>() );
        Human Vanya = new Human("Ваня", true,17,new ArrayList<Human>() );
        Human Anya = new Human("Аня", false,31,new ArrayList<Human>() );
        Human papaDima = new Human("Дима", true,51,new ArrayList<Human>(Arrays.asList(Anya,Vanya,Vitya)));
        Human mamaTanya = new Human("Таня", false,51,new ArrayList<Human>(Arrays.asList(Anya,Vanya,Vitya)));
        Human babaValya = new Human("Валя", false,71,new ArrayList<Human>(Arrays.asList(papaDima)));
        Human dedTolya = new Human("Анатолий", true,75,new ArrayList<Human>(Arrays.asList(papaDima)));
        Human dedIvan = new Human("Иван", true,78,new ArrayList<Human>(Arrays.asList(mamaTanya)));
        Human babaTonya = new Human("Антонина", false,75,new ArrayList<Human>(Arrays.asList(mamaTanya)));
        System.out.println(babaTonya.toString());
        System.out.println(dedIvan.toString());
        System.out.println(dedTolya.toString());
        System.out.println(babaValya.toString());
        System.out.println(papaDima.toString());
        System.out.println(mamaTanya.toString());
        System.out.println(Vanya.toString());
        System.out.println(Vitya.toString());
        System.out.println(Anya.toString());
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
