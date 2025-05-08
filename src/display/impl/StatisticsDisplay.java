package display.impl;

import display.IDisplayElement;
import observer.IObserver;
import subject.impl.WeatherData;

public class StatisticsDisplay implements IObserver, IDisplayElement {

    private float avgTemperature;
    private float maxTemperature;
    private float minTemperature;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        this.maxTemperature = Float.MIN_VALUE;
        this.minTemperature = Float.MAX_VALUE;
        this.avgTemperature = 0;

    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avgTemperature + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update() {
        avgTemperature =this.weatherData.getTemperature();
        maxTemperature = avgTemperature + 5f;
        minTemperature = avgTemperature - 5f;
        display();
    }
}
