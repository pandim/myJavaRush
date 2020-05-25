package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.util.Locale;


/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();
    public static volatile Person person;

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        //15-Apr-1990
        if (args.length > 0) {
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 3) {
                            if (args[i + 1].equals("м")) {
                                allPeople.add(Person.createMale(args[i],
                                        format.parse(args[i + 2])));
                            } else {
                                allPeople.add(Person.createFemale(args[i],
                                        format.parse(args[i + 2])));
                            }
                            System.out.println(allPeople.size() - 1);
                        }
                        break;
                    }
                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 4) {
                            if (args[i + 2].equals("м")) {
                                allPeople.set(Integer.parseInt(args[i]),
                                        Person.createMale(args[i + 1],
                                                format.parse(args[i + 3])));
                            } else {
                                allPeople.set(Integer.parseInt(args[i]),
                                        Person.createFemale(args[i + 1],
                                                format.parse(args[i + 3])));
                            }
                        }
                        break;
                    }
                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            person = allPeople.get(Integer.parseInt(args[i]));
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                    break;
                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            person = allPeople.get(Integer.parseInt(args[i]));
                            System.out.println(person.getName()
                                    + (person.getSex() == Sex.MALE ? " м " : " ж ") +
                                    formatOut.format(person.getBirthDate()));
                        }
                        break;
                    }
            }
        }
    }
}