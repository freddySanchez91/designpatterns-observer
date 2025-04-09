import display.impl.CurrentConditionsDisplay;
import subject.impl.WeatherData;

public class Main {
    public static void main(String[] args) {
       WeatherData weatherData = new WeatherData();
       CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay2 = new CurrentConditionsDisplay(weatherData);

       weatherData.setMeasurments(90, 65, 30.4f);
    }
}