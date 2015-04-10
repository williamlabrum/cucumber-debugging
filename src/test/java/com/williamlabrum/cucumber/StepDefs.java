package com.williamlabrum.cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class StepDefs {
    
    @Given("^some \"(.*?)\"$")
    public void some_data(String data) {
        System.out.println("Given is running data: " + data);
    }
    
    @When("^bar$")
    public void bar() {
        System.out.println("When is running");
    }
    
    @Then("^fizz$")
    public void fizz() {
        System.out.println("Then is running");
    }

}
