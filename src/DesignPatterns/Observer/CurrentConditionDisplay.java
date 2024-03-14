package DesignPatterns.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = weatherData.getTemp();
        this.humidity = humidity;
        Display();
    }

    public void Display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    public void registerTogetUpdates(){
        this.weatherData.registerObserver(this);
    }

    public void deregister(){
        this.weatherData.removeObserver(this);
    }
}
