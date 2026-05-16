import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrac2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> cartoons = new ArrayList<>();

        System.out.print("Enter the number of cartoons you would like to store: ");
        int numOfCartoon = s.nextInt();
        s.nextLine();

        for (int i = 1; i <= numOfCartoon; i++) {
            System.out.print("Enter cartoon #" + i + ": ");
            String cartoon = s.nextLine();
            cartoons.add(cartoon);
        }

        System.out.println("Your cartoons are: " + cartoons);



        s.close();
    }
}
