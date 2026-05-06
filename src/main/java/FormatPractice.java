public class FormatPractice {
    public static void main(String[] args) {

        // printf() = is a method used to format output

/*
        String name = "Marcus";
        char firstLetter = 'S';
        int age = 21;
        double height = 60.2;
        boolean isEmployed = true;

        // System.out.printf("Hello %s %d %f %b", name, age, height, isEmployed);

        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);

*/

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive


        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -150.43;

        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

    }
}
