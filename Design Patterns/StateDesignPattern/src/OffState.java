public class OffState extends State{
    OffState(AudioPlayer audioPlayer) {
        super(audioPlayer);
        System.out.println("In OFF State");
    }

    @Override
    public void clickPowerButton() {
        audioPlayer.changeState(new ReadyState(audioPlayer));
    }

    @Override
    public void clickPlay() {
        System.out.println("In OFF state");
    }

    @Override
    public void clickNext() {
        System.out.println("In OFF state");
    }

    @Override
    public void clickPrev() {
        System.out.println("In OFF state");
    }
}
