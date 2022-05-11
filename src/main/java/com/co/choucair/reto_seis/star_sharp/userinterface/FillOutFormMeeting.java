package com.co.choucair.reto_seis.star_sharp.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FillOutFormMeeting extends PageObject {

    public static final Target BUTTON_MEETING = Target.the("Clic in the button meeting").located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[2]/a/span"));
    public static final Target BUTTON_METTINGS = Target.the("Clic in the button meetings").located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[2]/ul/li[1]/a/span"));
    public static final Target NEW_MEETING = Target.the("Clic in the button new meeting").located(By.xpath("/html/body/main/section/div/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target INPUT_MEETING_NAME = Target.the("write the name meeting").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[1]/input"));
    public static final Target MEETING_TYPE = Target.the("Clic in the select meeting type").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[2]/div[1]/a"));
    public static final Target INPUT_METTING_TYPE = Target.the("write the meeting type").located(By.xpath("/html/body/div[6]/div/input"));
    public static final Target INPUT_MEETING_NUMBER = Target.the("write the number for the meeting").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[3]/input"));
    public static final Target INPUT_START_DATE = Target.the("Write the start date ").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_StartDate\"]"));
    public static final Target INPUT_START_HOUR = Target.the("select the hour start date").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[4]/select"));
    public static final Target INPUT_END_DATE = Target.the("Write the end date").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_EndDate\"]"));
    public static final Target INPUT_END_HOUR = Target.the("select the hour end date").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[5]/select"));
    public static final Target LOCATION = Target.the("Clic in the select location").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[6]/div[1]"));
    public static final Target INPUT_LOCATION = Target.the("write the location").located(By.xpath("//*[@id=\"s2id_autogen7_search\"]"));
    public static final Target UNIT = Target.the("Clic in the select unit").located(By.id("select2-chosen-8"));
    public static final Target INPUT_UNIT = Target.the("write the unit").located(By.id("s2id_autogen8_search"));
    public static final Target ORGANIZE_BY = Target.the("Clic in the select organize by").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[8]/div[1]"));
    public static final Target INPUT_ORGANIZE_BY = Target.the("write the organized by").located(By.xpath("//*[@id=\"s2id_autogen9_search\"]"));
    public static final Target REPORTER = Target.the("Clic in the select reporter").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[9]/div[1]"));
    public static final Target INPUT_REPORTER = Target.the("write the reporter").located(By.id("s2id_autogen10_search"));
    public static final Target ATTENDEE_LIST = Target.the("Clic in the select attendee list").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[10]/div[1]/div[1]/div[2]"));
    public static final Target INPUT_ATTENDEE_LIST = Target.the("write the attendee list").located(By.xpath("//*[@id=\"s2id_autogen12_search\"]"));
    public static final Target INPUT_ATTENDEE_TYPE = Target.the("Select attendee type").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[10]/div[1]/div[2]/div[4]/div[3]/div/div/div[3]/select"));
    public static final Target INPUT_ATTENDANCE_STATUS = Target.the("Select attendance status").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[10]/div[1]/div[2]/div[4]/div[3]/div/div/div[4]/select"));
    public static final Target SAVE_MEETING = Target.the("Save the meeting").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[1]/div/div/div/div[1]/div/span"));
    public static final Target SEARCH_METTING = Target.the("search meeting").located(By.xpath("/html/body/main/section/div/div[2]/div[1]/input"));
    public static final Target MEETING_NAME_TABLE = Target.the("name meeting").located(By.xpath("//body/main[1]/section[1]/div[1]/div[3]/div[4]/div[3]/div[1]/div[1]/div[2]"));

}
