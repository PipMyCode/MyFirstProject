import java.util.Scanner;

public class EnhancedSwitchesPrac {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statements


        Scanner input = new Scanner(System.in);

        String animal;

        System.out.print("Enter the name of the animal: ");
        animal = input.nextLine().trim().toLowerCase();


        switch (animal) {
            case "cat", "parrot", "bird" ->
                    System.out.println("It is a domestic animal");

            case "tiger", "eagle", "lion", "leopard" ->
                    System.out.println("It is a wild animal");

            default -> System.out.println(animal + " is not in our animal list");

        }

        input.close();
    }
}
