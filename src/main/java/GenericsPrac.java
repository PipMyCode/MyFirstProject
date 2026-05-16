import java.util.ArrayList;

public class GenericsPrac {
    public static void main(String[] args) {

        //DIAMOND Operator <>


      //  Box<Integer> box = new Box<>();

       // box.setItem(5);

       // System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("Laptop", 1000.00);

        Product<String, Integer> product2 = new Product<>("Ticket", 10);

        System.out.println(product1.getPrice());
        System.out.println(product2.getPrice());
    }
}
