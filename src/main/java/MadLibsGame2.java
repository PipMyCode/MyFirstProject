import java.util.Scanner;

public class MadLibsGame2 {
    public static void main(String[] args) {

        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String verb2;
        String adjective3;

        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();

        System.out.print("Enter a verb: ");
        verb2 = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        adjective3 = scanner.nextLine();




        System.out.println("Today I went to an " + adjective1 + " amusement park.");
        System.out.println("In a store, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was so " + adjective2 + " and I " + verb1 + " stop " + verb2 + " at it.");
        System.out.println("I was " + adjective3 + "!!");




        scanner.close();
    }
}
