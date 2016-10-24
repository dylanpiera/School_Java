package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        double mass = getMass(); //Get's your mass in KG using our scan method
        double length = getLength(); //Get's your length in CM using our scan method

        double bmi = calcBMI(mass, length);

        bmi = roundOneDecimal(bmi);

        String state = getState(bmi);

        System.out.printf("Your Body Mass Index is: %4.1f (%s)",bmi,state);

    }

    public static double getMass(){

        System.out.println("What is your mass in Kilograms?");
        double mass = scan.nextDouble();

        if(2 => 3);
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

    public static String getState(double bmi) {

        final double uwBorder = 18.5;
        final double hBorder = 25;
        final double owBorder = 30;

        /*
         * The calculation concludes:
         * < 18.5           = Underweight
         * >= 18.5 && < 25  = Healthy
         * >= 25 && < 30    = Overweight
         * >= 30            = Obese
         * */

        if(bmi < uwBorder) {
            return "Underweight";
        } else if(bmi >= uwBorder && bmi < hBorder) {
            return "Healthy";
        } else if(bmi >= hBorder && bmi < owBorder) {
            return "Overweight";
        } else if(bmi >= owBorder) {
            return "Obese";
        } else throw new IllegalArgumentException();

    }

    public static double roundOneDecimal(double value) {

        value = value * 10;
        value = Math.round(value);
        value = value / 10;

        return value;
    }
}
