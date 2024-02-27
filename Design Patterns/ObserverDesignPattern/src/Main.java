public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.updateHumidity(10);
        weatherStation.updateTemperature(35);
        IObserver liveDisplay1 = new LiveDisplay();
        IObserver statisticsDisplay1 = new StatisticsDisplay();
        IObserver forecastDisplay1 = new ForecastDisplay();
        weatherStation.subscribe(liveDisplay1);
        weatherStation.subscribe(statisticsDisplay1);
        weatherStation.updateTemperature(30);
        weatherStation.subscribe(forecastDisplay1);
        weatherStation.updateHumidity(12);
    }
}