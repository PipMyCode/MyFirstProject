import java.util.Scanner;

public class SearchAnArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numbers = {1, 4, 7, 9, 2, 10};
        String[] fruits = {"Apple", "Banana", "Orange", "cherry"};
        boolean isFound = false;
        String target;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();




        // Performing linear search

        // Never use == to compare strings

        for(int i = 0; i < fruits.length; i++) {
            if(fruits[i].equalsIgnoreCase(target)) {
                System.out.println("Found the element at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound) {
            System.out.println("Element not found");
        }

        scanner.close();
    }
}
