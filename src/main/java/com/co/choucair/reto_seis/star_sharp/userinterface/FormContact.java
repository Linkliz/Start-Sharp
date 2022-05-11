package com.co.choucair.reto_seis.star_sharp.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormContact extends PageObject {
    public static final Target BUTTON_CONTACTS = Target.the("Click in the button contacts").located(By.xpath("//span[contains(text(),'Contacts')]"));
    public static final Target BUTTON_NEW_CONTACT = Target.the("Click in the button new contact").located(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]"));
    public static final Target BUTTON_SAVE = Target.the("Click in the button save").located(By.xpath("//body/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
    public static final Target MESSAGE_ERROR = Target.the("See the message error").located(By.xpath("//div[contains(text(),'Please validate empty or invalid inputs (marked wi')]"));
}
