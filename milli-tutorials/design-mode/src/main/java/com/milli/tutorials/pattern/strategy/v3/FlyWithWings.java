package com.milli.tutorials.pattern.strategy.v3;

import lombok.extern.log4j.Log4j2;

/**
 * FlyWithWings
 *
 * @since 2022/9/18
 **/
@Log4j2
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        log.info("fly with wings");
    }
}
