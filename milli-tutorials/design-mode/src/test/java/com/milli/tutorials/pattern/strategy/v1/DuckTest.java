package com.milli.tutorials.pattern.strategy.v1;


import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

@Log4j2
class DuckTest {
    private static void testDuckMethod(Duck duck) {
        duck.quack();

        duck.swim();

        duck.display();

        duck.fly();
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
    void testMallardDuck() {
        Duck duck = new MallardDuck();
        testDuckMethod(duck);
    }


    @Test
    void testRedHeadDuck() {
        Duck duck = new RedHeadDuck();
        testDuckMethod(duck);
    }

    @Test
    void testRubberDuck() {
        Duck duck = new RubberDuck();
        testDuckMethod(duck);
    }

    @AfterAll
    static void conclusion() {
       log.info("使用继承完成功能扩展的缺点:");
       log.info("  代码在多个子类中重复");
       log.info("  难以获得所有子类的知识");
       log.info("  运行时子类的行为难以改变");
       log.info("  父类的修改会不经意的影响到所有的子类");
    }
}