package com.javarush.task.task19.task1907;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Test {

    public static void main (String[] args) throws java.lang.Exception
    {
        String text = "The urn was then carried for several rounds around the cremation site, for the last leg of the procession.";
        String[] results = text.split("\\W+");
        System.out.println(Arrays.toString(results));
    }
}