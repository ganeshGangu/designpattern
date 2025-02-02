package com.designpatterns.behavioral.observer;

public class AlertSRETeam implements  Observer{
    @Override
    public void execute() {
        System.out.println("SRE Team alerted");
    }
}
