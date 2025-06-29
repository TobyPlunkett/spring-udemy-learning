package com.tobyplunkett.springcore.demo.firstcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private field for dependency
    private Coach myCoach;

    @Autowired //tells spring to inject dependency. If you only have one constructor this can be omitted.
    public DemoController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){return myCoach.getDailyWorkout();}


}
