package com.co.choucair.reto_seis.star_sharp.task;

import com.co.choucair.reto_seis.star_sharp.model.MeetingData;
import com.co.choucair.reto_seis.star_sharp.userinterface.FillOutFormMeeting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class MeetingFillOutForm implements Task {

    private MeetingData meetingData;

    public MeetingFillOutForm(MeetingData meetingData) {
        this.meetingData = meetingData;
    }

    public static MeetingFillOutForm the(MeetingData meetingData) {
        return Tasks.instrumented(MeetingFillOutForm.class,meetingData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FillOutFormMeeting.BUTTON_MEETING),
                Click.on(FillOutFormMeeting.BUTTON_MEETINGS),
                Click.on(FillOutFormMeeting.NEW_MEETING),
                Enter.theValue(meetingData.getMeetingName()).into(FillOutFormMeeting.INPUT_MEETING_NAME),
                Click.on(FillOutFormMeeting.MEETING_TYPE),
                Enter.keyValues(meetingData.getMeetingType()).into(FillOutFormMeeting.INPUT_MEETING_TYPE).thenHit(Keys.ENTER),
                Enter.theValue(meetingData.getMeetingNumber()).into(FillOutFormMeeting.INPUT_MEETING_NUMBER),
                Enter.theValue(meetingData.getStartDate()).into(FillOutFormMeeting.INPUT_START_DATE),
                SelectFromOptions.byValue(meetingData.getStartHour()).from(FillOutFormMeeting.INPUT_START_HOUR),
                Enter.theValue(meetingData.getEndDate()).into(FillOutFormMeeting.INPUT_END_DATE),
                SelectFromOptions.byValue(meetingData.getEndHour()).from(FillOutFormMeeting.INPUT_END_HOUR),
                Click.on(FillOutFormMeeting.LOCATION),
                Enter.theValue(meetingData.getLocation()).into(FillOutFormMeeting.INPUT_LOCATION).thenHit(Keys.ENTER),
                Click.on(FillOutFormMeeting.UNIT),
                Enter.theValue(meetingData.getUnit()).into(FillOutFormMeeting.INPUT_UNIT).thenHit(Keys.ENTER),
                Click.on(FillOutFormMeeting.ORGANIZE_BY),
                Enter.theValue(meetingData.getOrganizedBy()).into(FillOutFormMeeting.INPUT_ORGANIZE_BY).thenHit(Keys.ENTER),
                Click.on(FillOutFormMeeting.REPORTER),
                Enter.theValue(meetingData.getReporter()).into(FillOutFormMeeting.INPUT_REPORTER).thenHit(Keys.ENTER),
                Click.on(FillOutFormMeeting.ATTENDEE_LIST),
                Enter.theValue(meetingData.getAttendeeList()).into(FillOutFormMeeting.INPUT_ATTENDEE_LIST).thenHit(Keys.ENTER),
                Click.on(FillOutFormMeeting.INPUT_ATTENDEE_TYPE),
                Hit.the(Keys.ARROW_DOWN).into(FillOutFormMeeting.INPUT_ATTENDEE_TYPE),
                Hit.the(Keys.ENTER).into(FillOutFormMeeting.INPUT_ATTENDEE_TYPE),
                Click.on(FillOutFormMeeting.INPUT_ATTENDANCE_STATUS),
                Hit.the(Keys.ARROW_DOWN).into(FillOutFormMeeting.INPUT_ATTENDANCE_STATUS),
                Hit.the(Keys.ARROW_DOWN).into(FillOutFormMeeting.INPUT_ATTENDANCE_STATUS),
                Hit.the(Keys.ENTER).into(FillOutFormMeeting.INPUT_ATTENDANCE_STATUS),
                Click.on(FillOutFormMeeting.SAVE_MEETING),
                Enter.theValue(meetingData.getMeetingName()).into(FillOutFormMeeting.SEARCH_MEETING)
                );
    }
}
