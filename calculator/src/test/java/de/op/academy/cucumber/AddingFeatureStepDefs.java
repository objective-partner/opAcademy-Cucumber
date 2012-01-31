package de.op.academy.cucumber;

import static org.junit.Assert.assertEquals;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class AddingFeatureStepDefs {

	private Calculator calculator;

	@Given("^a calculator I just turned on$")
	public void aCalculatorIJustTurnedOn() {
		calculator = new Calculator();
	}

	@When("^I add (\\d+) and (\\d+)$")
	public void iAddAnd(int arg1, int arg2) {
		calculator.push(arg1);
		calculator.push(arg2);
	}

	@Then("^the result is (\\d+)$")
	public void theResultIs(int arg1) {
		assertEquals(arg1, calculator.getValue());
	}
}
