package com.company;

import java.util.Scanner;

public class Main {

    protected static final double MAX_POINTS = 28;
    protected static final double SATISFACTORY = 5.5;

    protected static final String[] SUBJECTS = {
            "Project Fasten Your Seatbelt",
            "Programming",
            "Databases",
            "Personal Skills",
            "Project Skills",
            "Game Design"
    };
    protected static final int[] POINTS = {
        12,
        6,
        3,
    };

    private static double[] grades = {0, 0, 0, 0, 0, 0, 0};
    private static double[] pointGot = {0, 0, 0, 0, 0, 0, 0};

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please fill in your grades:");
        gradesAndSubjects();
        checkGrades();
        printResults();
        bsaCheck();
    }

    private static void gradesAndSubjects() {
        int index = 0;
        for (String name : SUBJECTS) {
            System.out.print(name + ": ");
            grades[index] = scan.nextDouble();
            index++;
        }
    }

    private static void checkGrades() {

        System.out.println("test");
        pointGot[0] = (grades[0] >= SATISFACTORY && grades[0] <= 10) ? POINTS[0] : 0;
        pointGot[1] = (grades[1] >= SATISFACTORY && grades[0] <= 10) ? POINTS[1] : 0;
        pointGot[2] = (grades[2] >= SATISFACTORY && grades[0] <= 10) ? POINTS[1] : 0;
        pointGot[3] = (grades[3] >= SATISFACTORY && grades[0] <= 10) ? POINTS[2] : 0;
        pointGot[4] = (grades[4] >= SATISFACTORY && grades[0] <= 10) ? POINTS[2] : 0;
        pointGot[5] = (grades[5] >= SATISFACTORY && grades[0] <= 10) ? POINTS[1] : 0;

    }

    private static void printResults() {
        int index = 0;
        for (String name : SUBJECTS) {
            System.out.print("Vak/Project: " + name + "\tCijfer: " + grades[index] + "\tBehaalde punten: " + pointGot[index] + "\n");
            index++;
        }
    }

    private static void bsaCheck() {
        double total = 0;
        for (double sum : pointGot) {
            total += sum;
        }


        if(total <= (MAX_POINTS * (5/6))) {
            System.out.println("Warning. You are on your way for a negative BSA.");
        }
    }
}
