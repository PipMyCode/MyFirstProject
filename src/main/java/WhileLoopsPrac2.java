import java.util.Scanner;

public class WhileLoopsPrac2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;
        boolean isNumberInvalid = true;

        do {
            System.out.print("Enter a number between 1 and 100: ");
            number = input.nextInt();
            isNumberInvalid = (number < 1 || number > 100);

            if (isNumberInvalid) {
                System.out.println("Please enter a number between 1 and 100");
            }

        } while (isNumberInvalid);

        System.out.println("Number is " + number);

        input.close();
    }
}
