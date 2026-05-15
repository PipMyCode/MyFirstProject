public class Vehicle {

    String make;
    String model;
    int year;
    String color;

    Vehicle(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + " " + this.model + " " + this.year;
    }
}
