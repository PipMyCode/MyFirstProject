public class VariableScopePrac {

    static int x = 3; //CLASS
    public static void main(String[] args) {
        // variable scope = where a variable can be accessed


        int x = 1;

        System.out.println(x);


        doSomething();



    }

    static void doSomething() {

        int x = 2;

        System.out.println(x);
    }
}
