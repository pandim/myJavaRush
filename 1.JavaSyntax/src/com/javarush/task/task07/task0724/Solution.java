package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human pers01 = new Human("Валентина", false, 71);
        Human pers02 = new Human("Анатолий", true, 73);
        Human pers03 = new Human("Антонина", false, 75);
        Human pers04 = new Human("Иван", true, 80);
        Human pers05 = new Human("Дмитрий", true,51, pers02, pers01);
        Human pers06 = new Human("Татьяна",false, 51, pers04, pers03);
        Human pers07 = new Human("Анна", false, 31, pers05, pers06);
        Human pers08 = new Human("Иван", true, 17, pers05, pers06);
        Human pers09 = new Human("Виктор", true,5,pers08,pers07);
        System.out.println(pers01);
        System.out.println(pers02);
        System.out.println(pers03);
        System.out.println(pers04);
        System.out.println(pers05);
        System.out.println(pers06);
        System.out.println(pers07);
        System.out.println(pers08);
        System.out.println(pers09);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}