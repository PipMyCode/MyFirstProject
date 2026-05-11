public class MethodsPractice {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()

        String name = "Adigun";
        int age = 21;
        boolean employed = true;

        myStack(name, age, employed);


    }

    static void myStack(String name, int age, boolean employed) {
        System.out.printf("I am %s!\n", name);
        System.out.printf("I am %d years old\n", age);
        System.out.printf("I am employed: %b\n", employed);
        System.out.println("I am a backend engineer");
        System.out.println("I am a simple engineer");
        System.out.println("I am a simple engineer\n");
    }


}
