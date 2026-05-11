public class MethodsPractice {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()






        int age = 33;

        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You must be 18+ to sign up!");
        }

    }

    static void myStack(String name, int age, boolean employed) {
        System.out.printf("I am %s!\n", name);
        System.out.printf("I am %d years old\n", age);
        System.out.printf("I am employed: %b\n", employed);
        System.out.println("I am a backend engineer");
        System.out.println("I am a simple engineer");
        System.out.println("I am a simple engineer\n");
    }

    static double square(int number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        if( age >=18 ) {
            return true;
        }
        else  {
            return false;
        }
    }

}
