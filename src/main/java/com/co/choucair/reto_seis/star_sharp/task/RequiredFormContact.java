package com.co.choucair.reto_seis.star_sharp.task;

import com.co.choucair.reto_seis.star_sharp.userinterface.FillOutFormBussinesUnit;
import com.co.choucair.reto_seis.star_sharp.userinterface.FormContact;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RequiredFormContact implements Task {


    public static RequiredFormContact the() {
       return Tasks.instrumented(RequiredFormContact.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FillOutFormBussinesUnit.BUTTON_ORGANIZATION),
                Click.on(FormContact.BUTTON_CONTACTS),
                Click.on(FormContact.BUTTON_NEW_CONTACT),
                Click.on(FormContact.BUTTON_SAVE));
    }
}
