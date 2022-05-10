package com.co.choucair.reto_seis.star_sharp.stepdefinitions;

import com.co.choucair.reto_seis.star_sharp.model.BussinesUnitData;
import com.co.choucair.reto_seis.star_sharp.model.MeetingData;
import com.co.choucair.reto_seis.star_sharp.model.UserData;
import com.co.choucair.reto_seis.star_sharp.questions.StarSharpAnswer;
import com.co.choucair.reto_seis.star_sharp.task.BussinesUnitFillOutForm;
import com.co.choucair.reto_seis.star_sharp.task.Login;
import com.co.choucair.reto_seis.star_sharp.task.MettingFillOutForm;
import com.co.choucair.reto_seis.star_sharp.task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class BussinesUnitAndMeetingsStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Lizeth wants to create business units and a meeting$")
    public void thanLizethWantsToCreateBusinessUnitsAndAMeeting(List<UserData> userData) {
        OnStage.theActorCalled("Lizeth").wasAbleTo(OpenUp.thePage(), (Login.onThePage(userData.get(0))));
    }

    @When("^She create business units$")
    public void sheCreateBusinessUnits(List<BussinesUnitData> bussinesUnitData) {
        OnStage.theActorInTheSpotlight().attemptsTo(BussinesUnitFillOutForm.the(bussinesUnitData.get(0)));
    }

    @When("^She create meeting$")
    public void sheCreateMeeting(List<MeetingData> meetingData) {
        OnStage.theActorInTheSpotlight().attemptsTo(MettingFillOutForm.the(meetingData.get(0)));
    }

    @Then("^she successfully validates the creation of the meeting$")
    public void sheSuccessfullyValidatesTheCreationOfTheMeeting(List<MeetingData> meetingData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(StarSharpAnswer.toThe(meetingData.get(0).getMeetingName())));
    }
}
