package com.milli.tutorials.pattern.observer.v2;

import lombok.extern.log4j.Log4j2;

/**
 * CurrentConditionDisplay
 *
 * @since 2022/9/18
 **/
@Log4j2
public class CurrentConditionDisplay implements DisplayElement, Observer {

    private double temperature;

    private double humidity;

    private final WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("current weather condition, temperature: {}, humidity: {}", temperature, humidity);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void unRegister() {
        this.weatherData.removeObserver(this);
    }
}
