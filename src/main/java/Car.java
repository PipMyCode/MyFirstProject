public class Car {

    // Attributes. this that an object has
    String make = "Toyota";
    String model = "Crown";
    int year = 2026;
    double price = 50000.99;
    boolean isNew = true;
    boolean isRunning = false;


    void start() {
        isRunning = true;
        System.out.println("You start the car!");
    }
    void stop() {
        isRunning = false;
        System.out.println("You stop the car!");
    }

    void drive() {
        System.out.println("You drive the " + model);
    }

    void brake() {
        System.out.println("You brake the " + model);
    }
}
