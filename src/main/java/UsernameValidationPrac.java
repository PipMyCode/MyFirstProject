import java.util.Scanner;

public class UsernameValidationPrac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String username;
        System.out.print("Enter your username: ");

        username = input.nextLine().trim();

        boolean hasNumber =
                username.matches(".*[0-9].*");

        boolean validLength = username.length() >= 4 && username.length() <= 15;


        if (username.isBlank() ) {
            System.out.println("Username cannot be empty");
        }
        else if (!validLength) {
            System.out.println("Username must be between 4 and 15 characters");
        }

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
