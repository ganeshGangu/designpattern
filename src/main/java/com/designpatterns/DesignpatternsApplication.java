package com.designpatterns;

import com.designpatterns.behavioral.observer.EventsManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternsApplication {

	public static void main(String[] args) {

		SpringApplication.run(DesignpatternsApplication.class, args);
		EventsManager.managerEvents();
	}

}
