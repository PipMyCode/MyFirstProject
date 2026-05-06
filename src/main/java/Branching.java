import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter you age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();


        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");


        // BLOCK 1
        if (age < 0) {
            System.out.println("You haven't been born yet!");
        }
        else if ( age == 0) {
            System.out.println("You are a baby!");
        }
        else if ( age >= 18) {
            System.out.println("You are an adult!");
        }
        else {
            System.out.println("You are a minor!");
        }

        // BLOCK 2
        if (isStudent) {
            System.out.println(name + " is a student!");
        }
        else {
            System.out.println(name + " is not a student!");
        }

        scanner.close();
    }
}
