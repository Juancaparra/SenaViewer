package edu.misena.senaviewer.model;

import java.util.Date;
import java.util.ArrayList;

public class Publication {
    private static ArrayList<Publication> publications=new ArrayList<>();
    String title;
    Date edititionDate;
    String editorial;
    String authors;

    public Publication(String title, Date edititionDate, String editorial) {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEditionDate() {
        return edititionDate;
    }

    public void setEditionDate(Date editionDate) {
        this.edititionDate = editionDate;
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

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", edititionDate=" + edititionDate +
                ", editorial='" + editorial + '\'' +
                ", authors='" + authors + '\'' +
                '}';
    }
}
