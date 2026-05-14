import java.util.Scanner;

public class CalculateAreaOFaRectangle {
    public static void main(String[] args) {

        double width = 0;
        double length = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        length = scanner.nextDouble();

        area = width * length;

        System.out.println("The area of the triangle is: " + area + "cm²");



        scanner.close();



    }
}
