public abstract class State {
    AudioPlayer audioPlayer;
    State(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }
    public abstract void clickPowerButton();
    public abstract void clickPlay();
    public abstract void clickNext();
    public abstract void clickPrev();
}
