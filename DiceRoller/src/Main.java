import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static Random rand = new Random();
    private static int result;
    private static char character;

    public static void main(String[] args) {

        System.out.print("What character would you like to use for the dice: ");
        character = scan.nextLine().charAt(0);

        rollDice();
    }

    private static void rollDice()  {
        do {
            result = rand.nextInt(6)+1;
            printDice(result);

        } while(result != 6);
    }


    private static void printDice(int result) {
        switch (result) {
            case 1:
                System.out.printf("     %n" + "  "+character+"  %n" + "     %n", character);
                break;
            case 2:
                System.out.printf(""+character+"     %n" + "     %n" + "    "+character+" %n", character);
                break;
            case 3:
                System.out.printf("    "+character+" %n" + "  "+character+"   %n" + ""+character+"     %n", character);
                break;
            case 4:
                System.out.printf(""+character+"    "+character+" %n" + "     %n" + ""+character+"    "+character+" %n", character);
                break;
            case 5:
                System.out.printf(""+character+"    "+character+" %n" + "  "+character+"   %n" + ""+character+"    "+character+" %n", character);
                break;
            case 6:
                System.out.printf(""+character+"    "+character+" %n" + ""+character+"    "+character+" %n" + ""+character+"    "+character+" %n", character);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
