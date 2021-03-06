package com.williamlabrum.cucumber;

import cucumber.api.Scenario;
import cucumber.api.java.Before;


public class BeforeStepDefs {
    
    @Before("@myTag")
    public void before(Scenario scenario){
        for(String tag : scenario.getSourceTagNames()){
            System.out.print("Tag: " + tag);
        }
    }
    
    @Before("@myTag2")
    public void before2(Scenario scenario){
        for(String tag : scenario.getSourceTagNames()){
            System.out.print("Tag: " + tag);
        }
    }
    
}
