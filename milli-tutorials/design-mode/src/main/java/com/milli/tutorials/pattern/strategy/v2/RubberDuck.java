package com.milli.tutorials.pattern.strategy.v2;

import lombok.extern.log4j.Log4j2;

/**
 * RubberDuck
 *
 * @since 2022/9/18
 **/
@Log4j2
public class RubberDuck extends Duck implements QuackAble {

    @Override
    public void display() {
        log.info("rubber duck display by override parent class");
    }

    @Override
    public void quack() {
        log.info("rubber duck quack by interface");
    }
}
