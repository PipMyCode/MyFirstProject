public class SmartPhone implements Camera, GPS {
    @Override
    public void takePicture() {
        System.out.println("Taking a picture");

    }

    @Override
    public void Findlocation() {
        System.out.println("Finding location");

    }
}
