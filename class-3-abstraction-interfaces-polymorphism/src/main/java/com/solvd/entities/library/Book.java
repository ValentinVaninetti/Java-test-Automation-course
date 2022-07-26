package com.solvd.entities.library;

import java.util.UUID;

public final class Book {
    private String name;
    private Boolean isRetired;
    private String bookId = UUID.randomUUID().toString(); // autogenerated id.
    private String type;

    public Book(String bookName, boolean isRetired, String type) {
        this.name = bookName;
        this.isRetired = isRetired;
        this.type = type;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRetired() {
        return isRetired;
    }

    public void setRetired(Boolean retired) {
        isRetired = retired;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            return this.bookId.equals(((Book) obj).getBookId());
        } else {
            return false;
        }
    }
}
