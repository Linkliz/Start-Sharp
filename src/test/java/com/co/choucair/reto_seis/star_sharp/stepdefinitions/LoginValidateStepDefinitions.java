package com.co.choucair.reto_seis.star_sharp.stepdefinitions;

import com.co.choucair.reto_seis.star_sharp.model.UserData;
import com.co.choucair.reto_seis.star_sharp.questions.LoginValidateAnswer;
import com.co.choucair.reto_seis.star_sharp.questions.StarSharpAnswer;
import com.co.choucair.reto_seis.star_sharp.task.Login;
import com.co.choucair.reto_seis.star_sharp.task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class LoginValidateStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Lizeth wants to login other credentials$")
    public void thanLizethWantsToLoginOtherCredentials(List<UserData> userData) {
        OnStage.theActorCalled("Lizeth").wasAbleTo(OpenUp.thePage(), (Login.onThePage(userData.get(0))));
    }


    @Then("^she successfully validates that the credentials do not exist$")
    public void sheSuccessfullyValidatesThatTheCredentialsDoNotExist(List<String> messageError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginValidateAnswer.toThe(messageError.get(0))));
    }
}
