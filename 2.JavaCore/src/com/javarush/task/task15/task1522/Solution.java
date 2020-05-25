package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
        }

    public static void readKeyFromConsoleAndInitPlanet(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String planet = null;
        try {
            planet = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (planet) {
            case Planet.SUN:
                thePlanet = Sun.getInstance();break;
            case Planet.EARTH:
                thePlanet = Earth.getInstance();break;
            case Planet.MOON:
                thePlanet = Moon.getInstance();break;
            default:
                thePlanet = null;
        }
    }

    public static void main(String[] args) {

    }


}
