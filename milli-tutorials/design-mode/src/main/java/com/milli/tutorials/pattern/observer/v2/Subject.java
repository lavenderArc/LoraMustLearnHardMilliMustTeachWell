package com.milli.tutorials.pattern.observer.v2;

/**
 * Subject
 *
 * @since 2022/9/18
 **/
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
