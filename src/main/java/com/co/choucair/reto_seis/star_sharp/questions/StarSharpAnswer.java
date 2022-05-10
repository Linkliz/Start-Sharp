package com.co.choucair.reto_seis.star_sharp.questions;

import com.co.choucair.reto_seis.star_sharp.model.MeetingData;
import com.co.choucair.reto_seis.star_sharp.userinterface.FillOutFormMetting;
import com.co.choucair.reto_seis.star_sharp.userinterface.LoginValidatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.xpath.operations.Bool;

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
        Boolean result;
        String nameMeeting = Text.of(FillOutFormMetting.MEETING_NAME_TABLE).viewedBy(actor).asString();
        if (nameMeeting.equals("Meetings")){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
