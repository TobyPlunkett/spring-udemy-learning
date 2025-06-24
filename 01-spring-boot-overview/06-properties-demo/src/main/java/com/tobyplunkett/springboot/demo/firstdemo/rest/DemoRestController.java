package com.tobyplunkett.springboot.demo.firstdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    //inject properties from application.properties
    @Value("${config.test.value}")
    private String configTestValue;

    @Value("${team.name}")
    private String teamName;

    @Value("${coach.name}")
    private String coachName;

    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "hello world " + configTestValue ;
    }

    //expose new endpoint "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "run a 5k ";
    }

    //expose new endpoint "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){ return "Today is your lucky day"; }

    //expose endpoint for team info
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + " Team Name: " + teamName;
    };

}
