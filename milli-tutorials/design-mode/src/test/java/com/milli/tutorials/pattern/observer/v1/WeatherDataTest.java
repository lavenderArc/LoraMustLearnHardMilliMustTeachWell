package com.milli.tutorials.pattern.observer.v1;

import org.junit.jupiter.api.Test;

class WeatherDataTest {

    @Test
    void measurementsChanged() {
        WeatherData weatherData = new WeatherData();
        weatherData.measurementsChanged();
    }
}