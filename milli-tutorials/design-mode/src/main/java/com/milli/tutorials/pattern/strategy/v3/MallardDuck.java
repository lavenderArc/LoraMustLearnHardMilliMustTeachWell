package com.milli.tutorials.pattern.strategy.v3;

/**
 * MallardDuck
 *
 * @since 2022/9/18
 **/
public class MallardDuck extends Duck {
    // set behavior by constructor
    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }
}
