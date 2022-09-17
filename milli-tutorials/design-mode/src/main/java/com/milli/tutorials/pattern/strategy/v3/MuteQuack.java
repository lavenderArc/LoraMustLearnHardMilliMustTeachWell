package com.milli.tutorials.pattern.strategy.v3;

import lombok.extern.log4j.Log4j2;

/**
 * MuteQuack
 *
 * @since 2022/9/18
 **/
@Log4j2
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
       log.info("no quack");
    }
}
