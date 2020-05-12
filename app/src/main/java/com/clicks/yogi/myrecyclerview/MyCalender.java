package com.clicks.yogi.myrecyclerview;

public class MyCalender {
    String month,weekdays;

    public MyCalender() {
        // add a empty constructor...
    }

    public MyCalender(String month, String weekdays) {
        this.month = month;
        this.weekdays = weekdays;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(String weekdays) {
        this.weekdays = weekdays;
    }
}