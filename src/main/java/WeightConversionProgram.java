import java.util.Scanner;

public class WeightConversionProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        int weightInKg;
        double weightInPounds;
        String answer;

        System.out.print("Do you want to convert your weight to pounds? (yes/no): ");
        answer = input.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.print("Enter your name: ");
            name = input.nextLine();

            System.out.print("Enter weight in kg: ");
            weightInKg = input.nextInt();

            weightInPounds = weightInKg * 2.20462;

            System.out.println("My name is " + name);
            System.out.println("Weight in kg is " + weightInKg + "kg");
            System.out.printf("Your weight in pounds is %.2flbs ", weightInPounds);
            if (weightInPounds >= 200) {
                System.out.printf("\nYou need to hit the gym %s💀!!!", name);
            } else if (weightInPounds >= 150) {
                System.out.printf("\nYou are getting there %s, keep it up", name);
            } else {
                System.out.printf("\nYou are in good shape %s 😁!", name);
            }

        } else {
            System.out.println("Bye!!");
        }


        input.close();
    }
}

