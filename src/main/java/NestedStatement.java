import java.util.Scanner;

public class NestedStatement {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int age;
        boolean hasID;

        System.out.print("Enter your age: ");
        age = s.nextInt();
        s.nextLine();

        System.out.print("Do you have a valid ID (true/false)?: ");
        hasID = s.nextBoolean();


        if (age >= 18) {
            if (hasID) {
                System.out.println("Entry allowed");
            } else {
                System.out.println("No ID, entry denied");
            }
        } else {
            System.out.println("Too young, entry denied");
        }

        if







    }
}
