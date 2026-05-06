import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int number;
        double price;



        number = random.nextInt(1, 11);
        price = random.nextDouble(2.50, 8.50);



        System.out.println(number);
        System.out.println(price);


    }
}
