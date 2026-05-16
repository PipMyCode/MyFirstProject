import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingPr {
    public static void main(String[] args) {

        // try-catch-finally{}

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number!");
        } catch (ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");

        } finally {
            System.out.println("This always runs");
        }

    }
}
