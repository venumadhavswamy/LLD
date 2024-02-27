public class ForecastDisplay extends IDisplay implements IObserver {
    private double temperatureTomorrow;
    private double humidityTomorrow;
    ForecastDisplay(){
        this.temperatureTomorrow = 0;
        this.humidityTomorrow = 0;
    }
    @Override
    public void displayData() {
        System.out.println("Weather forecast for tomorrow:: Temperature: "+temperatureTomorrow+" Humidity: "+humidityTomorrow);
    }

    @Override
    public void updateTemperature(double temperature) {
        this.temperatureTomorrow = temperature+1;
        displayData();
    }

    @Override
    public void updateHumidity(double humidity) {
        this.humidityTomorrow = humidity + 1;
        displayData();
    }
}
