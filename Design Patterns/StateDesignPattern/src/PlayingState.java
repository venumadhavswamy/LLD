public class PlayingState extends State{
    PlayingState(AudioPlayer audioPlayer) {
        super(audioPlayer);
        System.out.println("In Playing State");
    }

    @Override
    public void clickPowerButton() {
        audioPlayer.changeState(new OffState(audioPlayer));
    }

    @Override
    public void clickPlay() {
        System.out.println("Paused the song");
        audioPlayer.changeState(new ReadyState(audioPlayer));
    }

    @Override
    public void clickNext() {
        System.out.println("Playing next song");
    }

    @Override
    public void clickPrev() {
        System.out.println("Playing previous song");
    }
}
