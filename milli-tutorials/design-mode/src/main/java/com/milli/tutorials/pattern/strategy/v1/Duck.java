package com.milli.tutorials.pattern.strategy.v1;

import lombok.extern.log4j.Log4j2;

/**
 * Duck
 *
 * @since 2022/9/17
 **/
@Log4j2
public abstract class Duck {

    public void quack() {
        log.info("duck quack");
    }

    public void swim() {
        log.info("duck swim");
    }

    public void display() {
        log.info("duck display");
    }

    public void fly() {
        log.info("duck fly");
    }
}
