import java.util.Scanner;

public class ArrayExe {
    public static void main(String[] args) {
        // before assigning values into an array our compiler needs to know the size of the
        // array.
        // we have to first allocate space for the array
        Scanner scanner = new Scanner(System.in);


        // creating an empty array that has space for 5 elements
        String[] foods;
        int size;

        System.out.print("What number of foods do you want to add?: ");
        size = scanner.nextInt();

        // FIX: to avoid the scanner from reading the next line
        scanner.nextLine();

        foods = new String[size];


        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
           System.out.println(food);
        }

        scanner.close();


    }
}
