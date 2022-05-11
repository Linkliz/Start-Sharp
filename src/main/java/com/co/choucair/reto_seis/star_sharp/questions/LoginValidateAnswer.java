package com.co.choucair.reto_seis.star_sharp.questions;

import com.co.choucair.reto_seis.star_sharp.userinterface.LoginValidatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginValidateAnswer implements Question<Boolean> {

    private String messageError;

    public LoginValidateAnswer(String messageError) {
        this.messageError = messageError;
    }

    public static LoginValidateAnswer toThe(String messageError) {
        return new LoginValidateAnswer(messageError);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String message = Text.of(LoginValidatePage.MESSAGE_ERROR_LABEL).viewedBy(actor).asString();
        if (messageError.equals(message)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
