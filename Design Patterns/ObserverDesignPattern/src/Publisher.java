public interface Publisher {// Can be called as EventManager or Subject
    void subscribe(IObserver observer);
    void unSubscribe(IObserver observer);
    void updateTemperature(double temperature);
    void updateHumidity(double humidity);
    void notifySubscribers(Double temperature,Double humidity);
}
