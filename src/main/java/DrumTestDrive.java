public class DrumTestDrive {
    public static void main(String[] args) {

        DrumKit d = new DrumKit();

        d.playSnare();
        d.playTopHat();

        if (d.snare == true) {
            d.snare = false;
            d.playSnare();
        }
    }
}
