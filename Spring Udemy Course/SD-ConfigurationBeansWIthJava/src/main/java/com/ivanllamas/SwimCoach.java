
package com.ivanllamas;

/*This will be our bean using Java code, no special annotations or anything like that, we will need a FortuneService
variable, and a Constructor for injection that takes in a FortuneService implemented object*/
public class SwimCoach implements Coach {
    
    
    /*We're gonna implement a fortune service dependency*/
    private FortuneService fortuneService;
    
    /*Constructor to inject our FortuneService dependency*/
    public SwimCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
