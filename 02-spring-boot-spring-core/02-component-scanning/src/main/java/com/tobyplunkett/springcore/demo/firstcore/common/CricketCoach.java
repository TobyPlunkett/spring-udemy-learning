package com.tobyplunkett.springcore.demo.firstcore.common;

import org.springframework.stereotype.Component;

@Component //marks class as spring bean and makes it available for dependency injection
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }
}
