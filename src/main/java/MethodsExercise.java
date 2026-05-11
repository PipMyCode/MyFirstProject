public class MethodsExercise {
    public static void main(String[] args) {


        int number = 10;

       if (isEven(number)) {
           System.out.println("Its an even number!");
       }
       else System.out.println("Its an odd number!");

      //
      String firstName = "Marcus";
      String lastName = "Adigun";
      String fullName =  getFullName(firstName, lastName);
      System.out.println(fullName);

      String name = "arcus";
      char initial = getInitial(name);
        System.out.println(initial);

    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    static char getInitial(String name) {
        return name.charAt(0);
    }
}
