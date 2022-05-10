package com.co.choucair.reto_seis.star_sharp.task;

import com.co.choucair.reto_seis.star_sharp.model.UserData;
import com.co.choucair.reto_seis.star_sharp.userinterface.StartSharpLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private UserData userData;

    public Login(UserData userData) {
        this.userData = userData;
    }

    public static Login onThePage(UserData userData) {
        return Tasks.instrumented(Login.class,userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(userData.getUser()).into(StartSharpLoginPage.INPUT_USER),
                Enter.theValue(userData.getPassword()).into(StartSharpLoginPage.INPUT_PASSWORD),
                Click.on(StartSharpLoginPage.ENTER_BUTTON));
    }
}
