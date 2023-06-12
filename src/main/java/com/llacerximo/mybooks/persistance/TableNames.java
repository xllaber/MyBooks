package com.llacerximo.mybooks.persistance;

public enum TableNames {
    AUTHOR("author"),
    BOOK("book"),
    SAGA("saga");

    private String name;

    TableNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
