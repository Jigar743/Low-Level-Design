package DesignPatterns.Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();



        CurrentConditionDisplay currentDisplay =
                new CurrentConditionDisplay(weatherData);
        StatisticDisplay statisticsDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurement(80, 65, 30.4f);
        weatherData.setMeasurement(82, 70, 29.2f);
        weatherData.setMeasurement(78, 90, 29.2f);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurement(62, 90, 28.1f);
        weatherData.registerObserver(forecastDisplay);
        weatherData.setMeasurement(99, 90, 28.1f);
    }
}
