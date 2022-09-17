package com.milli.tutorials.pattern.strategy.v2;

import lombok.extern.log4j.Log4j2;

/**
 * MallardDuck
 *
 * @since 2022/9/17
 **/
@Log4j2
public class MallardDuck extends Duck implements FlyAble, QuackAble {

    @Override
    public void display() {
        log.info("mallard duck display by override parent class");
    }

    @Override
    public void fly() {
        log.info("mallard duck fly by interface");
    }

    @Override
    public void quack() {
        log.info("mallard duck quack by interface");
    }
}
