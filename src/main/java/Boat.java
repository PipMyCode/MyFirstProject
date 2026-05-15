public class Boat {

    String model;
    String color;
    String type;
    int year;

    Boat(String model, String color, String type, int year){
        this.model = model;
        this.color = color;
        this.type = type;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.color + " " + this.model + " " + this.type + " " + this.year;
    }
}
