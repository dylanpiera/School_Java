package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = in.next();

        System.out.printf("Hello %s, in what year where you born?\n", name);
        int yob = in.nextInt();

        int age = 2016 - yob;
        double venusage = age * 0.62;

        System.out.printf("In 2016, you will be: %d years old, which is &f in \"VenusYears\"", age, venusage);
    }
}
