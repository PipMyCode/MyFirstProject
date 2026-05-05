public class Variables {
    public static void main(String[] args) {


        int age = 19;
        int year = 2026;
        int quantity = 1;

        /*


        System.out.println("I am " + age + " years of age");
        System.out.println("The year is " + year);
        System.out.println("The quantity of the flour is " + quantity);
        */

        double price = 50.99;
        double cgpa = 4.69;
        double temperature = -30.2;
        /*
        System.out.println("The price of the item is $" + price);
        System.out.println("My cgpa is " + cgpa);
        System.out.println("Today's temperature is exactly " + temperature);
        */

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        /*
        System.out.println("You got an " + grade + " in your Math course");
        System.out.println("Hey" + symbol);
        System.out.println("The official currency of the USA is " + currency);
        */

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

        /*
        if(isStudent) {
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }
        */

        String name = "Damola";
        String food = "Amala";
        String email = "blablabla123@gmail.com";
        String car = "Mustang Dark Horse";
        String color = "Orange";

        System.out.println("The price of the item is " + currency + price);
        System.out.println("In the year " + year + ", I got an " + color + " " + car + " and I registered it with " + name + " name");

        if(forSale) {
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }
    }
}
