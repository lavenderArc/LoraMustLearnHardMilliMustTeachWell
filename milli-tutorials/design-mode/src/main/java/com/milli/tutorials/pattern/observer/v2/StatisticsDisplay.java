package com.milli.tutorials.pattern.observer.v2;

import lombok.extern.log4j.Log4j2;

/**
 * StatisticsDisplay
 *
 * @since 2022/9/18
 **/
@Log4j2
public class StatisticsDisplay implements DisplayElement, Observer {

    private double temperature;

    private double humidity;

    private double pressure;

    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("statistic weather condition, temperature: {}, humidity: {}, pressure: {}", temperature, humidity, pressure);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    public void unRegister() {
        this.weatherData.removeObserver(this);
    }
}
