package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScaner) {
            this.fileScanner = fileScaner;
        }

        @Override
        public Person read() throws IOException {
            String lastName = fileScanner.next();//3
            String firstName = fileScanner.next();//1
            String middleName = fileScanner.next();//2
            SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
            Date date = null;
            try {
                date = dateFormat.parse(fileScanner.next()
                        + fileScanner.next() + fileScanner.next());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(firstName, middleName,lastName, date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
