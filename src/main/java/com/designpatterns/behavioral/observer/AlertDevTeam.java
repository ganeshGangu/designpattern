package com.designpatterns.behavioral.observer;

public class AlertDevTeam implements Observer{
    @Override
    public void execute() {
        System.out.println("Dev Team alerted");
    }
}
