package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
static {
    threads.add(new Thread(new MyClass1()));
    threads.add(new Thread(new MyClass2()));
    threads.add(new Thread(new MyClass3()));
    threads.add(new MyClass4());
    threads.add(new Thread(new MyClass5()));


}
    public static void main(String[] args) {
    }
}

class MyClass1 implements Runnable {
    @Override
    public void run() {
        while (true) {
        }
    }
}

class MyClass2 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

class MyClass3 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Ура");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyClass4 extends Thread implements Message {
    @Override
    public void run() {
        while (isInterrupted()) {
        }

    }

    @Override
    public void showWarning() {
        if (isAlive())interrupt();
    }
}

class MyClass5 implements Runnable {
    @Override
    public void run() {
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            int sum = 0;
            String s;
            while (!(s = reader.readLine()).equals("N"))
                sum += Integer.parseInt(s);
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
