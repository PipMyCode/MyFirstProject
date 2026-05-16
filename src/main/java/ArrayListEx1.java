import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of foods you would like to store: ");
        int numOfFoods = s.nextInt();
        s.nextLine();

        for (int i = 1; i <= numOfFoods; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = s.nextLine();
            foods.add(food);
        }

        System.out.println("Your foods are: " + foods);






        s.close();
    }
}
