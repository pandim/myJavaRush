package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zergA = new Zerg();
        zergA.name = "Azerg";
        Zerg zergB = new Zerg();
        zergB.name = "Bzerg";
        Zerg zergC = new Zerg();
        zergC.name = "Czerg";
        Zerg zergD = new Zerg();
        zergD.name = "Dzerg";
        Zerg zergE = new Zerg();
        zergE.name = "Ezerg";
        Protoss pa = new Protoss();
        pa.name = "ap";
        Protoss pb = new Protoss();
        pb.name = "bp";
        Protoss pc = new Protoss();
        pc.name = "cp";
        Terran ta = new Terran();
        ta.name = "at";
        Terran tb = new Terran();
        tb.name = "bt";
        Terran tc = new Terran();
        tc.name = "ct";
        Terran td = new Terran();
        td.name = "dt";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
