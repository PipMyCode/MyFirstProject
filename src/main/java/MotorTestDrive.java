public class MotorTestDrive {
    public static void main(String[] args) {


        Motor[] motorArray = {
                new Motor("Ferrari", "Red"),
                new Motor("BMW", "Blue"),
                new Motor("Mercedes", "Black")
        };

        for (Motor motor : motorArray) {
            motor.drive();
        }
    }
}
