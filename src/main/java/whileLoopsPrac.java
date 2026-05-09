import java.util.Scanner;

public class whileLoopsPrac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


      /*  String name = "";

        while (name.isEmpty()) {
            System.out.print("Please enter your name: ");
            name = input.nextLine();
        }


        System.out.println("Hello, " + name);




        String response = "";

        while (!response.equals("Q")) {
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = input.next().toUpperCase();

        }

        System.out.println("You have quit the game ");


       */

        int age = 0;


        do {

            System.out.print("Enter your age: ");
            age = input.nextInt();
             if (age < 0) {
                 System.out.println("Invalid age");
             }
        } while (age < 0);


        System.out.println("You are " + age + " years old");



        input.close();
    }
}
