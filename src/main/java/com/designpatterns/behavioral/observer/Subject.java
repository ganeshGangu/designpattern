package com.designpatterns.behavioral.observer;

public interface Subject {
    boolean addObserver(Observer observer);
    boolean remove(Observer observer);
    void notifyAllObservers();

}
