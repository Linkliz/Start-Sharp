package com.co.choucair.reto_seis.star_sharp.questions;

import com.co.choucair.reto_seis.star_sharp.userinterface.FillOutFormMeeting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class StarSharpAnswer implements Question<Boolean> {

    private String meetingName;

    public StarSharpAnswer(String meetingName) {
        this.meetingName = meetingName;
    }

    public static StarSharpAnswer toThe(String meetingName) {
        return new StarSharpAnswer(meetingName);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Boolean result;
        String nameMeeting = Text.of(FillOutFormMeeting.MEETING_NAME_TABLE).viewedBy(actor).asString();
        if (nameMeeting.equals(meetingName)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
