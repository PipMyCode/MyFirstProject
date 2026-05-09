import java.util.Scanner;

public class ForLoopsPrac {
    public static void main(String[] args) {

        // for loop = execute some code a CERTAIN amount of times

        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");

        int max = input.nextInt();

        for ( int i =1; i <= max; i++ ) {
            System.out.println(i);
        }


        input.close();
    }
}
