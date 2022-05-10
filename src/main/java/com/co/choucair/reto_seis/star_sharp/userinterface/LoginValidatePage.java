package com.co.choucair.reto_seis.star_sharp.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginValidatePage extends PageObject {

    public static final Target MESSAGE_ERROR_LABEL = Target.the("print the error message").located(By.xpath("//div[@class='toast-message']"));
}
