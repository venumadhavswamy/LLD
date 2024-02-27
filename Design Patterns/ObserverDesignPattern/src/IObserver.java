public interface IObserver{ // Can be called as Listener or Subscriber
    //[Manager-Listener] | [Publisher-Subscriber] | [Subject-Observer]
    void updateTemperature(double temperature);
    void updateHumidity(double humidity);
}
