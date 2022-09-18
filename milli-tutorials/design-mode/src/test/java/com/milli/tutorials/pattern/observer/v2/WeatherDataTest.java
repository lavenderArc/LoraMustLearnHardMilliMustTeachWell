package com.milli.tutorials.pattern.observer.v2;

import org.junit.jupiter.api.Test;

class WeatherDataTest {

    @Test
    void testSetMeasurements() {
        // 创建主题
        WeatherData weatherData = new WeatherData();

        // 创建观察者并订阅主题
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // 测试变更
        weatherData.setMeasurements(20, 30, 10010);
        weatherData.setMeasurements(30, 60, 10010);
        weatherData.setMeasurements(25, 45, 10010);

        // 取消订阅
        currentConditionDisplay.unRegister();
        weatherData.setMeasurements(31, 40, 10010);

        // 取消订阅
        statisticsDisplay.unRegister();
        weatherData.setMeasurements(32, 41, 10010);

        // 取消订阅
        forecastDisplay.unRegister();
        weatherData.setMeasurements(33, 42, 10010);
    }
}