package display.impl;

import display.IDisplayElement;
import observer.IObserver;
import subject.impl.WeatherData;

public class ForecastDisplay implements IObserver, IDisplayElement {

    private  float currentPresure = 29.34f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: " + (currentPresure > lastPressure ? "Improving weather on the way!" : "Watch out for cooler, rainy weather"));
    }

    @Override
    public void update() {
    this.lastPressure = currentPresure;
    this.currentPresure = weatherData.getPressure();
    display();
    }
}
