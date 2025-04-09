package subject.impl;

import observer.IObserver;
import subject.ISubject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {

    private List<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<IObserver>();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer: observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurmentschanged(){
        notifyObservers();
    }

    public void setMeasurments(float temperature, float humidity, float pressure){
        this.temperature =  temperature;
        this.humidity =  humidity;
        this.pressure = pressure;
        measurmentschanged();
    }

}
