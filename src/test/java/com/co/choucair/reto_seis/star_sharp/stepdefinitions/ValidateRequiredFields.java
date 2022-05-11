package com.co.choucair.reto_seis.star_sharp.stepdefinitions;

import com.co.choucair.reto_seis.star_sharp.questions.FormContactAnswer;
import com.co.choucair.reto_seis.star_sharp.questions.StarSharpAnswer;
import com.co.choucair.reto_seis.star_sharp.task.RequiredFormContact;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ValidateRequiredFields {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^she open the form Contact$")
    public void sheOpenTheFormContact() {
        OnStage.theActorInTheSpotlight().attemptsTo(RequiredFormContact.the());
    }


    @Then("^she successfully validates required fields into form Contact$")
    public void sheSuccessfullyValidatesRequiredFieldsIntoFormContact(List<String> messageError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FormContactAnswer.toThe(messageError.get(0))));
    }
}
