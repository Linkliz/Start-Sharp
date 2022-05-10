package com.co.choucair.reto_seis.star_sharp.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FillOutFormBussinesUnit extends PageObject {
    public static final Target BUTTON_ORGANIZATION = Target.the("Clic in the button Organization").located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[1]/a/span"));
    public static final Target BUTTON_BUSSINES_UNIT = Target.the("Clic in the button bussines unit ").located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[1]/ul/li[1]/a/span"));
    public static final Target BUTTON_CREATE = Target.the("Clic in the button new bussines").located(By.xpath("/html/body/main/section/div/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target INPUT_NAME = Target.the("write the name").located(By.name("Name"));
    public static final Target PARENT_UNIT = Target.the("Clic in the select parent unit ").locatedBy("/html/body/div[4]/div[2]/div/div[2]/form/div/div[1]/div/div/div[2]/div[1]/a");
    public static final Target INPUT_PARENT_UNIT = Target.the("write the parent unit").located(By.id("s2id_autogen1_search"));
    public static final Target BUTTON_SAVE = Target.the("Clic in the button save").locatedBy("/html/body/div[4]/div[2]/div/div[1]/div/div/div/div[1]/div/span");
}
