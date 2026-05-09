import java.util.Scanner;

public class UsernameValidationPrac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String username;
        System.out.print("Enter your username: ");

        username = input.nextLine().trim();

        boolean hasNumber =
                username.matches(".*[0-9].*");


        if (username.isBlank() ) {
            System.out.println("Username cannot be empty");
        }
        else if (username.length() < 4)
            System.out.println("Username is too short");

        else if (username.length() > 15)
            System.out.println("Username is too long");

        else if (username.contains(" ")) {
            System.out.println("Username cannot contain spaces");
        }

        else if (!hasNumber) {
            System.out.println("Username must contain at least one number");
        }

        else {
            System.out.println("Username is valid");
        }


        input.close();
    }
}
