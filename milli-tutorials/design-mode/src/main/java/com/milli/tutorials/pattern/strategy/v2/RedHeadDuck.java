package com.milli.tutorials.pattern.strategy.v2;

import lombok.extern.log4j.Log4j2;

/**
 * RedHeadDuck
 *
 * @since 2022/9/18
 **/
@Log4j2
public class RedHeadDuck extends Duck implements FlyAble, QuackAble {

    @Override
    public void display() {
        log.info("red head duck display by override parent class");
    }

    @Override
    public void fly() {
        log.info("red head duck fly by interface");
    }

    @Override
    public void quack() {
        log.info("red head duck quack by interface");
    }
}