package com.co.choucair.reto_seis.star_sharp.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class StartSharpLoginPage {
    public static final Target INPUT_USER  = Target.the("where do write the user").located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD  = Target.the("where do write the password").located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target ENTER_BUTTON  = Target.the("button to confirm login").located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
}
