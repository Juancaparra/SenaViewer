package edu.misena.senaviewer.model;

import java.util.Date;

public class Book {
    int id;
    String title;
    Date edititionDate;
    String editorial;
    String authors;
    int isbn;
    boolean readed;
    int timereaded;

    public Book(String title, Date edititionDate, String editorial, int isbn){
        this.title=title;
        this.edititionDate=edititionDate;
        this.editorial=editorial;
        this.isbn=isbn;
        this.readed=false;
        this.timereaded=0;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimereaded() {
        return timereaded;
    }

    public void setTimereaded(int timereaded) {
        this.timereaded = timereaded;
    }
}
