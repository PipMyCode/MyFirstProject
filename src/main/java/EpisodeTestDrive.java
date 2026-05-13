public class EpisodeTestDrive {
    public static void main(String[] args) {

        Episode episode1 = new Episode();

        episode1.seriesNumber = 4;
        episode1.play();

        episode1.skipIntro();
        episode1.skipToNext();


    }
}
