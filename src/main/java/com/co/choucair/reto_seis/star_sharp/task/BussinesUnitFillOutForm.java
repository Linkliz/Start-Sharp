package com.co.choucair.reto_seis.star_sharp.task;

import com.co.choucair.reto_seis.star_sharp.model.BussinesUnitData;
import com.co.choucair.reto_seis.star_sharp.userinterface.FillOutFormBussinesUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class BussinesUnitFillOutForm implements Task {

    private BussinesUnitData bussinesUnitData;

    public BussinesUnitFillOutForm(BussinesUnitData bussinesUnitData) {
        this.bussinesUnitData = bussinesUnitData;
    }

    public static BussinesUnitFillOutForm the(BussinesUnitData bussinesUnitData) {
        return Tasks.instrumented(BussinesUnitFillOutForm.class,bussinesUnitData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FillOutFormBussinesUnit.BUTTON_ORGANIZATION),
                Click.on(FillOutFormBussinesUnit.BUTTON_BUSSINES_UNIT),
                Click.on(FillOutFormBussinesUnit.BUTTON_CREATE),
                Enter.theValue(bussinesUnitData.getName()).into(FillOutFormBussinesUnit.INPUT_NAME),
                Click.on(FillOutFormBussinesUnit.PARENT_UNIT),
                Enter.theValue(bussinesUnitData.getParentUnit()).into(FillOutFormBussinesUnit.INPUT_PARENT_UNIT).thenHit(Keys.ENTER),
                Click.on(FillOutFormBussinesUnit.BUTTON_SAVE));
    }
}
