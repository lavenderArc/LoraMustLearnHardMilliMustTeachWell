package com.milli.tutorials.pattern.strategy.v1;

import lombok.extern.log4j.Log4j2;

/**
 * RubberDuck
 *
 * @since 2022/9/17
 **/
@Log4j2
public class RubberDuck extends Duck {

    @Override
    public void fly() {
        log.warn("set to nothing for rubber duck.");
    }
}
