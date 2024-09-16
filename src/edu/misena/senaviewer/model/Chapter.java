package edu.misena.senaviewer.model;

import java.util.Date;
import java.util.ArrayList;

public class Chapter {
    private static ArrayList<Chapter> chapters=new ArrayList<>();
    int id;
    String title;
    int duration;
    int year;
    int viewed;
    int timeViewed;
    int sessionNumber;

    public Chapter(String title,int duration ,int year){
        this.title=title;
        this.duration=duration;
        this.year=year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getViewed() {
        return viewed;
    }

    public void setViewed(int viewed) {
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
}
