package com.co.choucair.reto_seis.star_sharp.model;

public class MeetingData {

    private String meetingName;
    private String meetingType;
    private String startDate;
    private String startHour;
    private String location;
    private String organizedBy;
    private String meetingNumber;
    private String endDate;
    private String endHour;
    private String unit;
    private String reporter;
    private String attendeeList;
    private String attendeeType;
    private String attendanceStatus;


    public MeetingData(String meetingName, String meetingType, String startDate, String startHour, String location, String organizedBy, String meetingNumber, String endDate, String endHour, String unit, String reporter, String attendeeList, String attendeeType, String attendanceStatus) {
        this.meetingName = meetingName;
        this.meetingType = meetingType;
        this.startDate = startDate;
        this.startHour = startHour;
        this.location = location;
        this.organizedBy = organizedBy;
        this.meetingNumber = meetingNumber;
        this.endDate = endDate;
        this.endHour = endHour;
        this.unit = unit;
        this.reporter = reporter;
        this.attendeeList = attendeeList;
        this.attendeeType = attendeeType;
        this.attendanceStatus = attendanceStatus;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOrganizedBy() {
        return organizedBy;
    }

    public void setOrganizedBy(String organizedBy) {
        this.organizedBy = organizedBy;
    }

    public String getMeetingNumber() {
        return meetingNumber;
    }

    public void setMeetingNumber(String meetingNumber) {
        this.meetingNumber = meetingNumber;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getAttendeeList() {
        return attendeeList;
    }

    public void setAttendeeList(String attendeeList) {
        this.attendeeList = attendeeList;
    }

    public String getAttendeeType() {
        return attendeeType;
    }

    public void setAttendeeType(String attendeeType) {
        this.attendeeType = attendeeType;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }
}
