package com.sakshi.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" that return "Hello World"


    @GetMapping("/")
    public String sayHello()  {
        return "Hello World!!";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!!!";
    }


    //expose  a new endpoint for "fortune"
    @GetMapping("fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.!!";
    }

    // expose a new endpoint for "exercise"
    @GetMapping("exercise")
    public String doDailyExercise() {
        return "Have a nice day!!";
    }

    // expose a new endpoint for "diet"
    @GetMapping("diet")
    public String doDailyDiet()  {
        return "stay healthy n happy";
    }




}
