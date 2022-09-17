package com.milli.tutorials.pattern.strategy.v3;

import lombok.extern.log4j.Log4j2;

/**
 * ModelDuck
 *
 * @since 2022/9/18
 **/
@Log4j2
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        super.display();
        log.info("I'm a model duck");
    }
}
