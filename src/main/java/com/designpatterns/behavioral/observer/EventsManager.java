package com.designpatterns.behavioral.observer;

public class EventsManager {

    public static void managerEvents(){

        SecurityEvents securityEvents = new SecurityEvents();
        securityEvents.addObserver(new AlertDevTeam());
        securityEvents.addObserver(new AlertSRETeam());

        securityEvents.notifyAllObservers();
    }
}
