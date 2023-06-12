package com.llacerximo.mybooks.bussines.entity;

public class Author {

    private String id;
    private String name;
    private String img;
    private String country;

    public Author(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Author(String id, String name, String img, String country) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
