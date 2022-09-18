package com.milli.tutorials.pattern.observer.v1;

import lombok.extern.log4j.Log4j2;

/**
 * WeatherData
 *
 * @since 2022/9/18
 **/
@Log4j2
public class WeatherData {
    private final CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();

    private final StatisticDisplay statisticDisplay = new StatisticDisplay();

    private final ForecastDisplay forecastDisplay = new ForecastDisplay();

    public double getTemperature() {
        return 38;
    }

    public double getHumidity() {
        return 30;
    }

    public double getPressure() {
        return 10010;
    }

    public void measurementsChanged() {
        double temp = getTemperature();
        double humidity = getHumidity();
        double pressure = getPressure();

        currentConditionDisplay.update(temp, humidity, pressure);
        statisticDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }
}
