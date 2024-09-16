package edu.misena.senaviewer.model;

import java.util.Date;
import java.util.ArrayList;

public class Magazine extends Publication{
    private static ArrayList<Publication> publications=new ArrayList<>();
    int id;
    String authors;

    public Magazine(String title, Date edititionDate, String editorial) {
        super(title, edititionDate, editorial);
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
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

    public Date getEdititionDate() {
        return edititionDate;
    }

    public void setEdititionDate(Date edititionDate) {
        this.edititionDate = edititionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }
}
