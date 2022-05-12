package com.co.choucair.reto_seis.star_sharp.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FillOutFormMeeting extends PageObject {

    public static final Target BUTTON_MEETING = Target.the("Clic in the button meeting").located(By.xpath("//span[.='Meeting']"));
    public static final Target BUTTON_MEETINGS = Target.the("Clic in the button meetings").located(By.xpath("//span[.='Meetings']"));
    public static final Target NEW_MEETING = Target.the("Clic in the button new meeting").located(By.xpath("//span[contains(.,'New Meeting')]"));
    public static final Target INPUT_MEETING_NAME = Target.the("write the name meeting").located(By.xpath("//input[@name='MeetingName']"));
    public static final Target MEETING_TYPE = Target.the("Clic in the select meeting type").located(By.cssSelector(".select2-allowclear .select2-chosen"));
    public static final Target INPUT_MEETING_TYPE = Target.the("write the meeting type").located(By.xpath("//input[@class='select2-input select2-focused']"));
    public static final Target INPUT_MEETING_NUMBER = Target.the("write the number for the meeting").located(By.xpath("//input[@name='MeetingNumber']"));
    public static final Target INPUT_START_DATE = Target.the("Write the start date ").located(By.xpath("//input[@name='StartDate']"));
    public static final Target INPUT_START_HOUR = Target.the("select the hour start date").located(By.cssSelector(".StartDate > .time"));
    public static final Target INPUT_END_DATE = Target.the("Write the end date").located(By.xpath("//input[@name='EndDate']"));
    public static final Target INPUT_END_HOUR = Target.the("select the hour end date").located(By.cssSelector(".EndDate > .time"));
    public static final Target LOCATION = Target.the("Clic in the select location").located(By.xpath("//div[@class='field LocationId col-sm-6']//a[contains(.,'--select--')]"));
    public static final Target INPUT_LOCATION = Target.the("write the location").located(By.cssSelector("[aria-owns='select2-results-7']"));
    public static final Target UNIT = Target.the("Clic in the select unit").located(By.id("select2-chosen-8"));
    public static final Target INPUT_UNIT = Target.the("write the unit").located(By.id("s2id_autogen8_search"));
    public static final Target ORGANIZE_BY = Target.the("Clic in the select organize by").located(By.xpath("//div[@class='field OrganizerContactId col-sm-6']//a[contains(.,'--select--')]"));
    public static final Target INPUT_ORGANIZE_BY = Target.the("write the organized by").located(By.cssSelector("[aria-owns='select2-results-9']"));
    public static final Target REPORTER = Target.the("Clic in the select reporter").located(By.xpath("//div[@class='field ReporterContactId col-sm-6']//a[contains(.,'--select--')]"));
    public static final Target INPUT_REPORTER = Target.the("write the reporter").located(By.id("s2id_autogen10_search"));
    public static final Target ATTENDEE_LIST = Target.the("Clic in the select attendee list").located(By.xpath("//a[contains(.,'--select contact to add--')]"));
    public static final Target INPUT_ATTENDEE_LIST = Target.the("write the attendee list").located(By.cssSelector("[aria-owns='select2-results-12']"));
    public static final Target INPUT_ATTENDEE_TYPE = Target.the("Select attendee type").located(By.xpath("//body[1]/main[1]/section[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[2]/div[4]/div[3]/div[1]/div[1]/div[3]/select[1]"));
    public static final Target INPUT_ATTENDANCE_STATUS = Target.the("Select attendance status").located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[10]/div[1]/div[2]/div[4]/div[3]/div/div/div[4]/select"));
    public static final Target SAVE_MEETING = Target.the("Save the meeting").located(By.xpath("//span[contains(.,'Save')]"));
    public static final Target SEARCH_MEETING = Target.the("search meeting").located(By.cssSelector(".s-Serenity-QuickSearchInput"));
    public static final Target MEETING_NAME_TABLE = Target.the("name meeting").located(By.xpath("//div[@class='slick-cell l1 r1']"));

}
