package com.company;

/**
 * Made by Dylan Piera 7-9-2016 - Practica Excercise 2B. Make a Body Mass Index calculator.
 */

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        double mass = getMass(); //Get's your mass in KG using our scan method
        double length = getLength(); //Get's your length in CM using our scan method

        double bmi = calcBMI(mass, length);

        System.out.printf("Your Body Mass Index is: %f",bmi);

        }

    public static double getMass(){

        System.out.println("What is your mass in Kilograms?");
        double mass = scan.nextDouble();

        return mass;
    }

    public static double getLength() {
        System.out.println("And what is your Length in Centimeters?");
        double length = scan.nextInt();

        return length;
    }

    public static double calcBMI(double mass, double length){
        //BMI = Gewicht in kilogram / (Lengte in meter * Lengte in meter)

        //cm to meters
        length = length / 100;

        //Using the formula
        double bmi = (mass / Math.pow(length,2));

        return bmi;
    }
}
