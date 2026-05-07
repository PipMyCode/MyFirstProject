import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Compound interest calculator

        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = input.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timeCompounded = input.nextInt();

        System.out.print("Enter the # of years: ");
        years = input.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompounded, timeCompounded * years);

        System.out.printf("The amount after %d years is N%,.2f", years, amount);


        input.close();
    }
}
