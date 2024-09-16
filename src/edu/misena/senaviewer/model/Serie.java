package edu.misena.senaviewer.model;

import java.util.Date;
import java.util.ArrayList;

public class Serie extends Film{
    private static ArrayList<Film> films=new ArrayList<>();
    int id;
    int year;
    boolean viewed;
    int timeViewed;
    int sessionQuantity;

    public Serie(String title,String genre, String creator, int duration){
        super(title, genre,creator, duration);
        this.title=title;
        this.genre=genre;
        this.creator=creator;
        this.duration=duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }
}
