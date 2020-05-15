package com.cucumber.Ilir_BDD;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class AC001_SampleBanking_StepDefinition {

	Given("^a user access the bank web app$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	});

	Given("^logs using the credentials$", (DataTable arg1) -> {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	});

	Given("^my checking account has balance equal or greater than zero$", () -> {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	});

	When("^I deposit (\\d+) to my checking account$", (Integer arg1) -> {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	});

	Then("^I should have additional (\\d+) as balance$", (Integer arg1) -> {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	});

	Given("^my checking account has a balance greater than (\\d+) before withdraw$", (Integer arg1) -> {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	});

	When("^I withdraw (\\d+) from my checking account$", (Integer arg1) -> {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	});

	Then("^I should have less (\\d+) as balance$", (Integer arg1) -> {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	});
	
}
