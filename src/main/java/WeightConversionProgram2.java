import java.util.Scanner;

public class WeightConversionProgram2 {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM


        Scanner input = new Scanner(System.in);


        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert kg to pounds");
        System.out.println("2. Convert pounds to kg");

        int option;
        double weightInKg;
        double weightInPounds;

        System.out.print("Choose an option: ");
        option = input.nextInt();

        if (option == 1) {
            System.out.print("Enter weight in kg: ");
            weightInKg = input.nextDouble();

            weightInPounds = weightInKg * 2.20462;
            System.out.printf("\nWeight in pounds: %.2f lbs", weightInPounds);

        } else if ( option == 2) {
            System.out.print("Enter weight in lbs: ");
            weightInPounds = input.nextDouble();

            weightInKg = weightInPounds / 2.20462;
            System.out.printf("\nWeight in kg: %.2f kg", weightInKg );
        }

        else {
            System.out.println("Invalid option");
        }


        input.close();
    }
}
