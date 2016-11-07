package top10;

import java.util.Scanner;

/**
 *
 * @author Dylan
 *
 * De PDF Met Uitleg is te vinden op de volgende link:
 * https://drive.google.com/file/d/0BzZML4nBZ33qQkxJdkVJNDgxbFU/view?usp=sharing
 *
 * Dit is puur een voorbeeld hoe je deze opdracht kan maken.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String[] CATEGORIES = {"Characters", "Music"};
        final String[][] SUB_CATEGORIES = {
            {"RWBY Characters", "SAO Characters", "Pokemon"},
            {"Pokemon Route Themes", "Sao Music", "Rwby Scores"}
        };
        String[] users = new String[3];
        int totalUsers = 1;

        users[0] = getUserName(); //Krijgt de username van de 1ste user van dit programma

        int[] choices = pickCategories(CATEGORIES, SUB_CATEGORIES, users[0]); //Zie pickCategories

        //Zet choices om in de categories en sla deze op in category & subCategory respectively.
        String category = CATEGORIES[choices[0]];
        String subCategory = SUB_CATEGORIES[choices[0]][choices[1]];

        String[][] top10 = new String[3][10];
        top10[0] = getTop10(subCategory); //Vraagt de gerbuiker om zijn top 10 lijst voor de category.

        System.out.println("\nWould you like to fill in a top 10 for the second user?\n1. Yes\n2. No\n------");
        int response = scan.nextInt();
        System.out.println("------");

        if (response == 1) {
            users[1] = getUserName();
            top10[1] = getTop10(subCategory);
            totalUsers = 2;

            System.out.println("\nWould you like to fill in a top 10 for the third user?\n1. Yes\n2. No\n------");
            response = scan.nextInt();
            System.out.println("------");

            if (response == 1) {
                users[2] = getUserName();
                top10[2] = getTop10(subCategory);
                totalUsers = 3;

            } else {
                endProgram(category, subCategory, users, top10, totalUsers);
            }
        } else {
            endProgram(category, subCategory, users, top10, totalUsers);
        }
    }

    //Vraagt de gebruiker om zijn of haar naam.
    public static String getUserName() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please tell us your name: ");
        String username = scan.next();
        return username;
    }

    //Selecteert de hoofd category. En geeft de index van deze terug.
    public static int selectMainCategory(String[] CATEGORIES, String username) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please select one of these categories " + username + ".\n");
        for (int i = 0; i < CATEGORIES.length; i++) {
            System.out.printf((i + 1) + ". " + CATEGORIES[i] + "\n");
        }
        System.out.println("------");

        int selection = scan.nextInt();
        while (selection > CATEGORIES.length || selection <= 0) {
            System.out.println("This number is out of bounds. Select one of the options from above.");
            selection = scan.nextInt();
        }
        System.out.println("------");
        return selection;
    }

    //Selecteert de sub category van het doorgegeven main category. En geeft de index van deze terug.
    public static int selectSubCategory(int mainCategory, String[][] SUB_CATEGORIES, String username) {
        Scanner scan = new Scanner(System.in);
        mainCategory--;
        System.out.printf("Please select one of these sub-categories " + username + ".\n");
        System.out.println("0. Back");
        for (int i = 0; i < SUB_CATEGORIES[(mainCategory)].length; i++) {
            System.out.printf((i + 1) + ". " + SUB_CATEGORIES[mainCategory][i] + "\n");
        }
        System.out.println("------");

        int selection = scan.nextInt();
        while (selection > SUB_CATEGORIES.length || selection < 0) {
            System.out.println("This number is out of bounds. Select one of the options from above.");
            selection = scan.nextInt();
        }
        System.out.println("------");
        return selection;
    }

    //Roept selectMainCategory & selectSubCategory aan, en geeft aan het einde de index van beide terug in array choices, choices[0] is de main category, en choices[1] de sub.
    public static int[] pickCategories(String[] CATEGORIES, String[][] SUB_CATEGORIES, String username) {
        int category;
        int subCategory;

        do {
            category = selectMainCategory(CATEGORIES, username);
            subCategory = selectSubCategory(category, SUB_CATEGORIES, username);
        } while (subCategory == 0);

        int[] choices = {(category - 1), (subCategory - 1)};
        return choices;
    }

    //Vraagt de user voor zijn top 10 lijst, seperated by commas.
    public static String[] getTop10(String subCategory) {
        String[] top10 = new String[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("You have chosen for the prompt: Top 10 " + subCategory + "\nPlease give us your top 10 list of this category seperated by commas. From 1 to 10.");

        String top10Items = scan.nextLine();
        top10 = top10Items.split(",");

        return top10;
    }

    //Print de gebruikers naam en zijn top 10 lijst
    public static void printTop10(String username, String[] top10) {
        System.out.println(username + "'s top 10: ");
        for(int i = 0;i < top10.length;i++) {
            System.out.println((i + 1) + ". " + top10[i]);
        }
        System.out.println("");
    }

    //Kijkt hoeveel gebruikers er zijn, en afhankelijk hiervan print hij een hoeveelheid top 10 lijsten uit.
    public static void endProgram(String category, String subCategory, String[] users, String[][] top10, int totalUsers) {
        System.out.println("------");

        System.out.println("The selected category was: " + subCategory + " and these are the results:\n");

        if (totalUsers == 1) {
            printTop10(users[0],top10[0]);


        } else if (totalUsers == 2) {
            printTop10(users[0],top10[0]);
            printTop10(users[1],top10[1]);

        } else if (totalUsers == 3) {
            printTop10(users[0],top10[0]);
            printTop10(users[1],top10[2]);
            printTop10(users[2],top10[3]);

        } else {
            System.out.println("An unknown error occured.");
        }
    }
}
