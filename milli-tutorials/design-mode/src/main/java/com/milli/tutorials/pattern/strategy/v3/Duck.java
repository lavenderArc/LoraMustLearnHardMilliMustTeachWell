package com.milli.tutorials.pattern.strategy.v3;

import lombok.extern.log4j.Log4j2;

/**
 * Duck
 *
 * @since 2022/9/18
 **/
@Log4j2
public abstract class Duck {
    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    // set behavior by setter method
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        log.info("duck swim");
    }

    public void display() {
        log.info("duck display");
    }
}
