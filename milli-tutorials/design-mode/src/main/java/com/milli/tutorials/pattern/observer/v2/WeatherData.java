package com.milli.tutorials.pattern.observer.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherData
 *
 * @since 2022/9/18
 **/
public class WeatherData implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    private double temperature;

    private double humidity;

    private double pressure;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public double getTemperature() {
        return this.temperature;
    }

    public double getHumidity() {
        return this.humidity;
    }

    public double getPressure() {
        return this.pressure;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
