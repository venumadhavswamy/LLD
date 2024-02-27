public class StatisticsDisplay extends IDisplay implements IObserver{
    private double minTemperature;
    private double maxTemperature;
    private double minHumidity;
    private double maxHumidity;

    public StatisticsDisplay() {
        this.minTemperature = Integer.MAX_VALUE;
        this.maxTemperature = 0;
        this.minHumidity = Integer.MAX_VALUE;
        this.maxHumidity = 0;
    }

    @Override
    public void displayData() {
        System.out.println("Statistics of Weather::\nMin Temperature: "+minTemperature+" Max Temperature: "+maxTemperature);
        System.out.println("Min Humidity: "+minHumidity+" Max Humidity: "+maxHumidity);
    }

    @Override
    public void updateTemperature(double temperature) {
        minTemperature = Math.min(minTemperature,temperature);
        maxTemperature = Math.max(maxTemperature,temperature);
        displayData();
    }

    @Override
    public void updateHumidity(double humidity) {
        minHumidity = Math.min(minHumidity, humidity);
        maxHumidity = Math.max(maxHumidity, humidity);
        displayData();
    }
}
