package com.co.choucair.reto_seis.star_sharp.task;

import com.co.choucair.reto_seis.star_sharp.model.MeetingData;
import com.co.choucair.reto_seis.star_sharp.userinterface.FillOutFormBussinesUnit;
import com.co.choucair.reto_seis.star_sharp.userinterface.FillOutFormMetting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class MettingFillOutForm implements Task {

    private MeetingData meetingData;

    public MettingFillOutForm(MeetingData meetingData) {
        this.meetingData = meetingData;
    }

    public static MettingFillOutForm the(MeetingData meetingData) {
        return Tasks.instrumented(MettingFillOutForm.class,meetingData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FillOutFormMetting.BUTTON_MEETING),
                Click.on(FillOutFormMetting.BUTTON_METTINGS),
                Click.on(FillOutFormMetting.NEW_MEETING),
                Enter.theValue(meetingData.getMeetingName()).into(FillOutFormMetting.INPUT_MEETING_NAME),
                Click.on(FillOutFormMetting.MEETING_TYPE),
                Enter.keyValues(meetingData.getMeetingType()).into(FillOutFormMetting.INPUT_METTING_TYPE).thenHit(Keys.ENTER),
                Enter.theValue(meetingData.getMeetingNumber()).into(FillOutFormMetting.INPUT_MEETING_NUMBER),
                Enter.theValue(meetingData.getStartDate()).into(FillOutFormMetting.INPUT_START_DATE),
                SelectFromOptions.byValue(meetingData.getStartHour()).from(FillOutFormMetting.INPUT_START_HOUR),
                Enter.theValue(meetingData.getEndDate()).into(FillOutFormMetting.INPUT_END_DATE),
                SelectFromOptions.byValue(meetingData.getEndHour()).from(FillOutFormMetting.INPUT_END_HOUR),
                Click.on(FillOutFormMetting.LOCATION),
                Enter.theValue(meetingData.getLocation()).into(FillOutFormMetting.INPUT_LOCATION).thenHit(Keys.ENTER),
                Click.on(FillOutFormMetting.UNIT),
                Enter.theValue(meetingData.getUnit()).into(FillOutFormMetting.INPUT_UNIT).thenHit(Keys.ENTER),
                Click.on(FillOutFormMetting.ORGANIZE_BY),
                Enter.theValue(meetingData.getOrganizedBy()).into(FillOutFormMetting.INPUT_ORGANIZE_BY).thenHit(Keys.ENTER),
                Click.on(FillOutFormMetting.REPORTER),
                Enter.theValue(meetingData.getReporter()).into(FillOutFormMetting.INPUT_REPORTER).thenHit(Keys.ENTER),
                Click.on(FillOutFormMetting.ATTENDEE_LIST),
                Enter.theValue(meetingData.getAttendeeList()).into(FillOutFormMetting.INPUT_ATTENDEE_LIST).thenHit(Keys.ENTER),
                Click.on(FillOutFormMetting.INPUT_ATTENDEE_TYPE),
                Hit.the(Keys.ARROW_DOWN).into(FillOutFormMetting.INPUT_ATTENDEE_TYPE),
                Hit.the(Keys.ENTER).into(FillOutFormMetting.INPUT_ATTENDEE_TYPE),
                Click.on(FillOutFormMetting.INPUT_ATTENDANCE_STATUS),
                Hit.the(Keys.ARROW_DOWN).into(FillOutFormMetting.INPUT_ATTENDANCE_STATUS),
                Hit.the(Keys.ARROW_DOWN).into(FillOutFormMetting.INPUT_ATTENDANCE_STATUS),
                Hit.the(Keys.ENTER).into(FillOutFormMetting.INPUT_ATTENDANCE_STATUS),
                Click.on(FillOutFormMetting.SAVE_MEETING),
                Enter.theValue(meetingData.getMeetingName()).into(FillOutFormMetting.SEARCH_METTING)
                );
    }
}
