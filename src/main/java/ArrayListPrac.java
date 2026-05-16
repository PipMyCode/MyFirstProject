import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPrac {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Grapes");

       // fruits.remove(2);

       // fruits.set(1, "Pineapple");


       // System.out.println(fruits.size());
     //   try {
        //    System.out.println(fruits.get(4));
       // } catch (IndexOutOfBoundsException e) {
    //        System.out.println("Index out of bounds");
    //   }

        Collections.sort(fruits);

        for(String fruit : fruits) {
            System.out.println(fruit);
        }



    }
}
