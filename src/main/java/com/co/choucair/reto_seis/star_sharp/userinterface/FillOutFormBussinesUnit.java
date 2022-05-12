package com.co.choucair.reto_seis.star_sharp.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FillOutFormBussinesUnit extends PageObject {
    public static final Target BUTTON_ORGANIZATION = Target.the("Clic in the button Organization").located(By.xpath("//span[.='Organization']"));
    public static final Target BUTTON_BUSSINES_UNIT = Target.the("Clic in the button bussines unit ").located(By.xpath("//span[.='Business Units']"));
    public static final Target BUTTON_CREATE = Target.the("Clic in the button new bussines").located(By.xpath("//span[contains(.,'New Business Unit')]"));
    public static final Target INPUT_NAME = Target.the("write the name").located(By.name("Name"));
    public static final Target PARENT_UNIT = Target.the("Clic in the select parent unit ").located(By.cssSelector(".select2-choice"));
    public static final Target INPUT_PARENT_UNIT = Target.the("write the parent unit").located(By.id("s2id_autogen1_search"));
    public static final Target BUTTON_SAVE = Target.the("Clic in the button save").located(By.xpath("//span[contains(.,'Save')]"));
}
