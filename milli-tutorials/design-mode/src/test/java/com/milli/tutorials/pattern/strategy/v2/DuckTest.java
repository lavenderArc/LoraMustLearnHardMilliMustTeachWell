package com.milli.tutorials.pattern.strategy.v2;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

@Log4j2
class DuckTest {
    private static void testDuckMethod(Duck duck) {
        duck.swim();

        duck.display();
    }

    private static void testFlyAbleMethod(FlyAble flyAble) {
        flyAble.fly();
    }

    private static void testQuackAbleMethod(QuackAble quackAble) {
        quackAble.quack();
    }

    @Test
    void testDuck() {
        Duck duck = new Duck() {
            @Override
            public void display() {
                super.display();
            }
        };
        testDuckMethod(duck);
    }


    @Test
    public void testMallardDuck() {
        Duck duck = new MallardDuck();
        testDuckMethod(duck);
        testFlyAbleMethod((FlyAble) duck);
        testQuackAbleMethod((QuackAble) duck);
    }

    @Test
    public void testRedHeadDuck() {
        Duck duck = new RedHeadDuck();
        testDuckMethod(duck);
        testFlyAbleMethod((FlyAble) duck);
        testQuackAbleMethod((QuackAble) duck);
    }

    @Test
    public void testRubberDuck() {
        Duck duck = new RubberDuck();
        testDuckMethod(duck);
        testQuackAbleMethod((QuackAble) duck);
    }

    @Test
    public void testDecoyDuck() {
        Duck duck = new DecoyDuck();
        testDuckMethod(duck);
    }

    @AfterAll
    static void conclusion() {
        log.info("使用接口完成功能扩展的缺点:");
        log.info("  摧毁了父类中的代码的复用，所有子类要单独实现了");
    }
}