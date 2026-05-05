import java.util.Scanner;

public class MadLibsGamee {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your dream car: " );
        String car = scanner.nextLine();

        System.out.print("Enter your dream country: ");
        String country = scanner.nextLine();

        System.out.print("Enter your province temperature: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What do you like doing when you are less busy? ");
        String hobby = scanner.nextLine();

        System.out.println("Your dream car is " + car);
        System.out.println("Your province temperature is " + temperature + "°C");
        System.out.println("You like " + hobby);
        System.out.println("Your dream country is " + country + " and it's " + temperature + "°C cold" + ", are you sure your " + car + " will function well?");


        scanner.close();


    }
}
