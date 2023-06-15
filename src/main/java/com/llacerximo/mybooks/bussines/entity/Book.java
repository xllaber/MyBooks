package com.llacerximo.mybooks.bussines.entity;

import java.util.Date;

public class Book {

    private String id;
    private String title;
    private String opinion;
    private String img;
    private Date starDate;
    private Date finishDate;
    private Date publishDate;
    private int pages;
    private int sagaNum;
    private Boolean fave;
    private Author author;
    private Saga saga;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(String id, String title, String opinion, String img, Date starDate, Date finishDate, Date publishDate, int pages, int sagaNum, Author author, Saga saga) {
        this.id = id;
        this.title = title;
        this.opinion = opinion;
        this.img = img;
        this.starDate = starDate;
        this.finishDate = finishDate;
        this.publishDate = publishDate;
        this.pages = pages;
        this.sagaNum = sagaNum;
        this.author = author;
        this.saga = saga;
    }

    public Book(String id, String title, String opinion, String img, Date starDate, Date finishDate, Date publishDate, int pages, int sagaNum, Boolean fave) {
        this.id = id;
        this.title = title;
        this.opinion = opinion;
        this.img = img;
        this.starDate = starDate;
        this.finishDate = finishDate;
        this.publishDate = publishDate;
        this.pages = pages;
        this.sagaNum = sagaNum;
        this.fave = fave;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Saga getSaga() {
        return saga;
    }

    public void setSaga(Saga saga) {
        this.saga = saga;
    }

    public int getSagaNum() {
        return sagaNum;
    }

    public void setSagaNum(int sagaNum) {
        this.sagaNum = sagaNum;
    }

    public Boolean getFave() {
        return fave;
    }

    public void setFave(Boolean fave) {
        this.fave = fave;
    }
}
