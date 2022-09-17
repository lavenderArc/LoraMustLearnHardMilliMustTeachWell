package com.milli.tutorials.pattern.strategy.v3;

import lombok.extern.log4j.Log4j2;

/**
 * FlyNoWay
 *
 * @since 2022/9/18
 **/
@Log4j2
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        log.info("no fly");
    }
}
