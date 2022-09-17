package com.milli.tutorials.pattern.strategy.v1;

import lombok.extern.log4j.Log4j2;

/**
 * MallardDuck
 *
 * @since 2022/9/17
 **/
@Log4j2
public class MallardDuck extends Duck {

    @Override
    public void display() {
        log.info("looks like mallard dock");
    }
}
