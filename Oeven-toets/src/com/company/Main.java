package com.company;

/*
 * Dit programma is geschreven als oeventoets in week 4 voor het vak "Programming"
 * het doel is om het "Plof" spel te simuleeren dat door kinderen vaak gespeeld wordt.
 * @Author Dylan Piera
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static String output = "";
    private static int plofGetal;

    public static void main(String[] args) {
        try {
            /*
             * Zolang het plofGetal niet tussen 2 & 9 is zal er worden gevraagt om een plofgetal in te vullen.
             */
            do {
                System.out.print("Wat is het \"Plof\" getal (2..9)? ");
                plofGetal = scan.nextInt();
            } while (plofGetal < 2 || plofGetal > 9);

            System.out.print("Tot en met welk getal moet ik tellen? ");
            int max = scan.nextInt();

            int index = 1;
            while (index <= max) {
                checkIfPlof(plofGetal, index);

                index++;
            }

            /*
             * output alle samegevoegde text, het had alleen een overbodige spatie aan het begin van de regel.
             * Daarom wordt eerst trim() er op uitgevoerd om die overbodige spatie weg te werken.
             */

            System.out.println(output.trim());

        } catch (InputMismatchException e) {
            /*
             * mocht het voorkomen dat er geen int wordt ingevuld zal je een melding geven dat je dit wel moet doen.
             */
            System.out.println("Het plofgetal en maxiumum moeten een heel getal zijn in numbers geschreven.");
        }
    }

    /*
     * Voegt of " plof" of " " + number aan output toe, zodat alles in een zin kan worden uit "geprint"
     */
    private static void checkIfPlof(int plof, int number) {
        if ( (number % plof) == 0) {
            output = output + " plof";
        } else {
            output = output + " " + number;
        }

    }

}
