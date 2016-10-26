package hva.practicum;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random rand = new Random();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] getallen = genereerGetallen();

        int guesses = 0;
        int correct = 0;
        boolean num1, num2, num3, isCorrect = false;
        do {
            guesses++;
            int[] input = getInput();


            num1 = komtVoorIn(input[0],getallen);
            num2 = komtVoorIn(input[1],getallen);
            num3 = komtVoorIn(input[2],getallen);


            if (num1&&num2&&num3) isCorrect = true;
            else {
                if (num1) correct = 1;
                if (num2) correct += 1;
                if (num3) correct += 1;
                if (num1 != true && num2 != true && num3 != true) correct = 0;
                System.out.println("Aantal correcte getallen = " + correct + "\n");
            }
        } while(isCorrect == false);

        System.out.println("\nU heeft " + guesses + " keer geraden");
        System.out.println("De te raden getallen waren: " + getallen[0] + " " + getallen[1] + " " + getallen[2]);

    }


    public static int[] genereerGetallen() {
        int[] getallen = new int[3];

        getallen[0] = (rand.nextInt(10)+1);

        do{
            getallen[1] = (rand.nextInt(10)+1);
        } while (getallen[0] == getallen[1]);
        do{
            getallen[2] = (rand.nextInt(10)+1);
        } while (getallen[0] == getallen[2] || getallen[1] == getallen[2]);

        return getallen;
    }

    public static boolean komtVoorIn(int zoekgetal, int[] lijst) {

        if(zoekgetal == lijst[0] || zoekgetal == lijst[1] || zoekgetal == lijst[2]) return true;
        else return false;
    }

    public static int[] getInput() {
        System.out.print("Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: ");
        String numbers = scan.nextLine();
        String[] sep = numbers.split(" ");

        int[] zoekgetallen = new int[3];

        try {
            zoekgetallen[0] = Integer.parseInt(sep[0]);
            zoekgetallen[1] = Integer.parseInt(sep[1]);
            zoekgetallen[2] = Integer.parseInt(sep[2]);
        } catch (NumberFormatException|IndexOutOfBoundsException e) {
            System.out.println("Please only fill in numbers.");
        }
        return zoekgetallen;

    }

}
