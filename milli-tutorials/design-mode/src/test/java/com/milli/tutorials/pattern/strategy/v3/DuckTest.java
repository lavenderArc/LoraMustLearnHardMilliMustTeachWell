package com.milli.tutorials.pattern.strategy.v3;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

@Log4j2
class DuckTest {

    private static void testDuckMethod(Duck duck) {
        duck.performFly();
        duck.performQuack();
        duck.swim();
        duck.display();
    }

    @Test
    public void testMallardDuck() {
        Duck duck = new MallardDuck(new Quack(), new FlyWithWings());
        testDuckMethod(duck);
    }

    @Test
    public void testRedHeadDuck() {
        Duck duck = new RedHeadDuck();
        duck.setQuackBehavior(new Quack());
        duck.setFlyBehavior(new FlyWithWings());
        testDuckMethod(duck);
    }

    @Test
    public void testRubberDuck() {
        Duck duck = new RubberDuck();
        duck.setQuackBehavior(new Squeak());
        duck.setFlyBehavior(new FlyNoWay());
        testDuckMethod(duck);
    }

    @Test
    public void testDecoyDuck() {
        Duck duck = new DecoyDuck();
        duck.setQuackBehavior(new MuteQuack());
        duck.setFlyBehavior(new FlyNoWay());
        testDuckMethod(duck);
    }

    // add a new kind of duck, add the fly with rocket behavior for model duck
    @Test
    public void testModelDuck() {
        Duck duck = new ModelDuck();
        duck.setQuackBehavior(new MuteQuack());
        duck.setFlyBehavior(() -> log.info("I'm flying with a rocket"));
        testDuckMethod(duck);
    }


    @AfterAll
    static void conclusion() {
        log.info("策略模式定义了一个算法族，分别封装起来，使得它们之间可以互相变换。策略让算法的变化独立于使用它的客户");
        log.info("优先使用组合而不是继承，将fly和quack行为变成组合");
    }
}