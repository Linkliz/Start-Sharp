package com.co.choucair.reto_seis.star_sharp.questions;

import com.co.choucair.reto_seis.star_sharp.userinterface.FormContact;
import com.co.choucair.reto_seis.star_sharp.userinterface.LoginValidatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FormContactAnswer implements Question<Boolean> {
    private String message;

    public FormContactAnswer(String message) {
        this.message = message;
    }

    public static FormContactAnswer toThe(String message) {
        return new FormContactAnswer(message);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String messageError = Text.of(FormContact.MESSAGE_ERROR).viewedBy(actor).asString();
        if (message.equals(messageError)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
