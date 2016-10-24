package hva.oeventoets;

import java.util.Scanner;

public class Main {

    public static String teamName1, teamName2;
    public static int[] scoreTeam1 = new int[7];
    public static int[] scoreTeam2 = new int[7];
    public static int winsTeam1, winsTeam2, winner;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        String[] credentials = {
                "Dylan", //name
                "IG103", //class
                "500746211" //Student ID
        };


        printCredentials(credentials[0], credentials[1], credentials[2]);

        getTeams();

        int i = 0;
        boolean winnerState = false;

        do{
            try {
                System.out.println("\nPlease give the scores for round " + (i+1));
                System.out.printf("\tPlease input the score of team 1: ");
                scoreTeam1[i] = scan.nextInt();
                System.out.printf("\tPlease input the score of team 2: ");
                scoreTeam2[i] = scan.nextInt();

                inputWinner(scoreTeam1[i], scoreTeam2[i]);

                winnerState = checkForWinner();

                i++;

            } catch(IllegalArgumentException e) {
                System.out.println("Something appears to be wrong. Please try again.");
            }



        } while (!winnerState);

        System.out.println("\nA total of " + i + " matches have been played and we've found ourselves a winner!");
        printWinner();

        printAllMatches(i);
    }

    public static void printWinner() {
        if(winner == 1) {
            System.out.println("The winners are: " + teamName1 + " whom have won with " + winsTeam1 + " - " + winsTeam2 + "\n");
        }else if(winner == 2) {
            System.out.println("The winners are: " + teamName2 + " whom have won with " + winsTeam2 + " - " + winsTeam1 + "\n");
        }
    }

    public static void inputWinner(int scoreTeam1, int scoreTeam2) {
        if(scoreTeam1 > scoreTeam2) {
            winsTeam1 += 1;
        } else if(scoreTeam2 > scoreTeam1) {
            winsTeam2 += 1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static boolean checkForWinner(){
        boolean winnerState = false;

        if (winsTeam1 >= 4) {
            winnerState = true;
            winner = 1;
        } else if (winsTeam2 >= 4) {
            winnerState = true;
            winner = 2;
        }

        return winnerState;
    }

    public static void printCredentials(String name, String klas, String ID) {
        System.out.println(name + " - " + klas + " - " + ID);
    }

    public static void getTeams(){
        System.out.printf("Please input the team name of team 1: ");
        teamName1 = scan.nextLine();
        System.out.printf("Please input the team name of team 2: ");
        teamName2 = scan.nextLine();
    }

    public static void printAllMatches(int x) {
        for(int i = 0;i <= x;i++) {

            System.out.printf("Match " + i + ": " + teamName1 + " - " + teamName2 + " " + scoreTeam1[i] + " - " + scoreTeam2[i] + "\n");

        }

    }

}
