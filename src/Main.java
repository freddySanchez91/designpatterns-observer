import display.impl.CurrentConditionsDisplay;
import display.impl.ForecastDisplay;
import display.impl.StatisticsDisplay;
import subject.impl.WeatherData;

public class Main {
    public static void main(String[] args) {
       WeatherData weatherData = new WeatherData();
       CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
       ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
       StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
       weatherData.setMeasurments(90, 65, 30.4f);



    }
}