package display.impl;

import display.IDisplayElement;
import observer.IObserver;
import subject.impl.WeatherData;

public class CurrentConditionsDisplay implements IDisplayElement , IObserver {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;


    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidiy, float pressure) {

        this.temperature = temp;
        this.humidity = humidiy;
        display();
    }
}
