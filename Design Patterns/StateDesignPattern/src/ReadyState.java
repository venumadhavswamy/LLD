public class ReadyState extends State {
    ReadyState(AudioPlayer audioPlayer) {
        super(audioPlayer);
        System.out.println("In Ready State");
    }

    @Override
    public void clickPowerButton() {
        audioPlayer.changeState(new OffState(audioPlayer));
    }

    @Override
    public void clickPlay() {
        audioPlayer.changeState(new PlayingState(audioPlayer));
    }

    @Override
    public void clickNext() {
        System.out.println("Move to next song");
    }

    @Override
    public void clickPrev() {
        System.out.println("Move to previous song");
    }
}
