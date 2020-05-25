package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat catGrandpa = new Cat(reader.readLine());
        Cat catGrandma = new Cat(reader.readLine());
        Cat catFather = new Cat(reader.readLine(),null,catGrandpa);
        Cat catMother = new Cat(reader.readLine(),catGrandma,null);
        Cat catSon = new Cat(reader.readLine(),catMother,catFather);
        Cat catDaughter = new Cat(reader.readLine(),catMother,catFather);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;


        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            String s = "The cat's name is " + name;
            if (mother == null) s += ", no mother";
            else s+= ", mother is " + mother.name;
            if (father == null) s += ", no father";
            else s+= ", father is " + father.name;
            return s;
        }
    }

}
