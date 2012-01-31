package de.op.academy.cucumber;

import cucumber.annotation.Pending;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class AddingFeatureStepDefs {

	private Calculator calculator;
	
	@Given("^a calculator I just turned on$")
	@Pending
	public void aCalculatorIJustTurnedOn() {
	    // Express the Regexp above with the code you wish you had
	}

	@When("^I add (\\d+) and (\\d+)$")
	@Pending
	public void iAddAnd(int arg1, int arg2) {
	    // Express the Regexp above with the code you wish you had
	}

	@Then("^the result is (\\d+)$")
	@Pending
	public void theResultIs(int arg1) {
	    // Express the Regexp above with the code you wish you had
	}
}
