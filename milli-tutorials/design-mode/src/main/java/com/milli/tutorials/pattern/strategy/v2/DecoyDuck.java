package com.milli.tutorials.pattern.strategy.v2;

import lombok.extern.log4j.Log4j2;

/**
 * DecoyDuck
 *
 * @since 2022/9/18
 **/
@Log4j2
public class DecoyDuck extends Duck {


    @Override
    public void display() {
        log.info("decoy duck display by override parent class");
    }
}
