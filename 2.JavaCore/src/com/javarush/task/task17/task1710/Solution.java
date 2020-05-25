package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();
    public static Person person;

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy");//15-Apr-1990
        if (args.length > 0) {
            switch (args[0]) {
                case "-c":
                    if (args[2].equals("м")) {
                        allPeople.add(Person.createMale(args[1],
                                format.parse(args[3])));
                    } else {
                        allPeople.add(Person.createFemale(args[1],
                                format.parse(args[3])));
                    }
                    System.out.println(allPeople.size() - 1);
                    break;
                case "-u":
                    if (args[3].equals("м")) {
                        allPeople.set(Integer.parseInt(args[1]),
                                Person.createMale(args[2],
                                        format.parse(args[4])));
                    } else {
                        allPeople.set(Integer.parseInt(args[1]),
                                Person.createFemale(args[2],
                                        format.parse(args[4])));
                    }
                    break;
                case "-d":
                    person = allPeople.get(Integer.parseInt(args[1]));
                    person.setName(null);
                    person.setSex(null);
                    person.setBirthDate(null);
                    break;
                case "-i":
                    person = allPeople.get(Integer.parseInt(args[1]));
                    System.out.println(person.getName()
                            + (person.getSex() == Sex.MALE ? " м " : " ж ") +
                            formatOut.format(person.getBirthDate()));
                    break;
            }
        }
    }
}
