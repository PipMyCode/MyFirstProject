
import java.util.Arrays;

public class ArraysPrac {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Banana", "Orange", "cherry"};
        int[] numbers = {100, 6000, 5, 48, 50};

        // you can change elements by specifying the index
      //  fruits[3] = "mango";
      //  numbers[3] = 2;

        // to access length of an array
       // int numOfFruits = fruits.length;
      //  int numOfNumbers = numbers.length;

      //  System.out.println(fruits[3]);
      //  System.out.println(numOfFruits);
       // System.out.println(numbers[3]);
       //System.out.println(numOfNumbers);

        // to print all elements of an array, we can use a for loop
       // for(int i = 0; i < fruits.length; i++) {
      //      System.out.print(fruits[i] + " ");

     //   }

        //enchanced for loop
        // for each loop.

        // if i need to sort my array in alphabetical order, i can use Arrays.sort() method.
      //  Arrays.sort(fruits);
      //  Arrays.sort(numbers);

        // fill elements with a given value

        Arrays.fill(fruits, "guava");

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        for(int myNumber : numbers) {
            System.out.println(myNumber);
        }
    }
}
