package edu.misena.senaviewer.model;

import java.util.Date;
import java.util.ArrayList;

public class Movie extends Film{
    private static ArrayList<Film> films=new ArrayList<>();
    int id;
    int year;
    boolean viewed;
    int timeViewed;

    public Movie(String title,String genre , String creator, int duration,int year ){
        super(title, genre, creator, duration);
        this.title=title;
        this.genre=genre;
        this.creator=creator;
        this.duration=duration;
        this.year=year;
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

    public boolean getViewed() {
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
}
