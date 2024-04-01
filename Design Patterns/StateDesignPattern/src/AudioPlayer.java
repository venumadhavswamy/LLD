public class AudioPlayer {
    private State state;
    AudioPlayer(){
        this.state = new ReadyState(this);
    }
    public void changeState(State state){
        this.state = state;
    }
    public void clickPowerButton(){
        System.out.println("Power button clicked:");
        state.clickPowerButton();
    }
    public void clickPlay(){
        System.out.println("Play button clicked:");
        state.clickPlay();
    }
    public void clickNext(){
        System.out.println("Next button clicked:");
        state.clickNext();
    }
    public void clickPrev(){
        System.out.println("Previous button clicked:");
        state.clickPrev();
    }

}
