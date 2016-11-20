package OOP.practica;

import OOP.practica.utilities.Subject;
import java.util.Scanner;

import static java.lang.Math.floor;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Subject[] subjects = new Subject[8];

        subjects[0] = new Subject("Fasten your Seatbelts", 12);
        subjects[1] = new Subject("Programming", 3);
        subjects[2] = new Subject("Object Oriented Programming 1", 3);
        subjects[3] = new Subject("Databases", 3);
        subjects[4] = new Subject("Game Basics", 3);
        subjects[5] = new Subject("User Interaction", 3);
        subjects[6] = new Subject("Personal Skills", 2);
        subjects[7] = new Subject("Project Skills", 2);

        for (int i = 0; i < subjects.length; i++) {
            setGrade(subjects[i]);
        }
        System.out.println();
        printResults(subjects);
    }

    private static void setGrade(Subject subject) {
        System.out.print("Please fill in your grade for: " + subject.getName() + ": ");

        double grade = scan.nextDouble();
        subject.setGrade(grade);
    }



    private static void printResults(Subject[] subjects) {
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("Subject/Project:\t%30s\tGrade: %1.1f\tPoints: %d\n",subjects[i].getName(),subjects[i].getGrade(),subjects[i].receivedPoints());
        }
        System.out.println();
        getBsaAdvice(subjects);
    }

    private static void getBsaAdvice(Subject[] subjects) {
        int totalPoints = 0, pointsReceived = 0;

        for (int i = 0; i < subjects.length; i++) {
            totalPoints += subjects[i].getPoints();
            pointsReceived += subjects[i].receivedPoints();
        }

        System.out.printf("Total received STP: %d/%d\n",pointsReceived,totalPoints);

        int toGetPoints = (int) floor(totalPoints * (5/6));
        if(pointsReceived <= toGetPoints) {
            System.out.println("Warning. You are on your way for a negative BSA.");
        }

    }
}
