package com.milli.tutorials.pattern.observer.v1;

import lombok.extern.log4j.Log4j2;

/**
 * ForecastDisplay
 *
 * @since 2022/9/18
 **/
@Log4j2
public class ForecastDisplay {
    public void update(double temp, double humidity, double pressure) {
        log.info("forecast weather, temperature: {}, humidity: {}, pressure: {}", temp, humidity, pressure);
    }
}
