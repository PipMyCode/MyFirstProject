import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Compound interest calculator

        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = s.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = s.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timeCompounded = s.nextInt();

        System.out.print("Enter the # of years: ");
        years = s.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompounded, timeCompounded * years);

        System.out.printf("The amount after %d years is N%,.2f", years, amount);


        s.close();
    }
}
