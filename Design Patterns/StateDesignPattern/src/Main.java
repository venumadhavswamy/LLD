public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.clickPlay();
        audioPlayer.clickNext();
        audioPlayer.clickPowerButton();
        audioPlayer.clickPlay();
        audioPlayer.clickPowerButton();
        audioPlayer.clickNext();
    }
}