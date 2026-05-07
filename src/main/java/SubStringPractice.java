import java.util.Scanner;

public class SubStringPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // .subString() = A method used to extract a portion of a string
        // .substring(start, end)

        String emailAddress;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        emailAddress = input.nextLine();

        if (emailAddress.contains("@")) {
            System.out.println("Your email is valid");
            username = emailAddress.substring(0, emailAddress.indexOf("@"));
            domain = emailAddress.substring(emailAddress.indexOf("@") + 1);
            System.out.println("Your username is " + username);
            System.out.println("Your domain name is " + domain);
        }
        else {
            System.out.println("Emails must contain @");
        }

        input.close();
       // System.out.println(email.substring(0, 5));
    }
}
