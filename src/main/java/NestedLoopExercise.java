import java.util.Scanner;

public class NestedLoopExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.println("Welcome to the Nested Loop Exercise.");

        System.out.print("Enter the number of rows you want: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns you want: ");
        columns = scanner.nextInt();

        System.out.print("Enter the type of symbol you want:");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);

            }
            System.out.println();
        }
        System.out.println("End of program.");


        scanner.close();
    }
}
