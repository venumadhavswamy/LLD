public class LiveDisplay extends IDisplay implements IObserver{
    private double temperature;
    private double humidity;

    public LiveDisplay() {
        this.temperature = 0;
        this.humidity = 0;
    }

    @Override
    public void displayData() {
        System.out.println("Live data of weather:: Temperature: "+temperature+" Humidity: "+humidity);
    }

    @Override
    public void updateTemperature(double temperature) {
        this.temperature = temperature;
        displayData();
    }

    @Override
    public void updateHumidity(double humidity) {
        this.humidity = humidity;
        displayData();
    }
}
