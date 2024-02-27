import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publisher{
    private double temperature;
    private double humidity;
    private List<IObserver> observers;
    WeatherStation(){
        this.temperature = 0;
        this.humidity = 0;
        observers = new ArrayList<>();
    }
    @Override
    public void subscribe(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void updateTemperature(double temperature) {
        this.temperature = temperature;
        notifySubscribers(temperature,null);
    }

    @Override
    public void updateHumidity(double humidity) {
        this.humidity = humidity;
        notifySubscribers(null,humidity);
    }

    @Override
    public void notifySubscribers(Double temperature, Double humidity) {
        for(IObserver observer:observers){
            if(humidity != null){
                observer.updateHumidity(humidity);
            }
            if(temperature != null){
                observer.updateTemperature(temperature);
            }
        }
    }
}
