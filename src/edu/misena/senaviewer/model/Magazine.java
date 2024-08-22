package edu.misena.senaviewer.model;

import java.util.Date;

public class Magazine {
    int id;
    String title;
    Date edititionDate;
    String editorial;
    String authors;

    public Magazine(String title, Date edititionDate, String editorial) {
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
