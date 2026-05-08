import java.util.Scanner;

public class LogicalOperatorsPrac {
    public static void main(String[] args) {

        // && = AND
        // || =OR
        // ! = NOT

        Scanner input = new Scanner(System.in);

        //double temp = 20;
        //boolean isSunny = false;
        //boolean isEnrolled = false;

        String role;

        System.out.print("Enter your role: ");
        role = input.nextLine().trim().toUpperCase();



      /*  if (temp <= 30 && temp >=0 && isSunny) {
            System.out.println("The weather is good");
            System.out.println("It is SUNNY outside");
        }
        else if (temp <= 30 && temp >=0 && !isSunny) {
            System.out.println("The weather is good");
            System.out.println("It is CLOUDY outside");
        }



        if (!isEnrolled) {
            System.out.println("Please enroll");
        }
        */

        if(role.equals("ADMIN") || role.equals("MANAGER")) {
            System.out.println("Access to dashboard");
        }
        else {
            System.out.println("Get outtt!!");
        }

        input.close();
    }
}
