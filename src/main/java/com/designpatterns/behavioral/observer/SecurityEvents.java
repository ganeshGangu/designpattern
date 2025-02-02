package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SecurityEvents implements Subject{

    private List<Observer> allObservers = new ArrayList<>();

    public void securityEventProcesser(){
        notifyAllObservers();
    }

    @Override
    public boolean addObserver(Observer observer) {
        return allObservers.add(observer);
    }

    @Override
    public boolean remove(Observer observer) {
        return  allObservers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
       for(Observer observer : allObservers){
           observer.execute();
       }
    }
}
