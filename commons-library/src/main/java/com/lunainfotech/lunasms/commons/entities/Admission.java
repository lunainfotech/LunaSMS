package com.lunainfotech.lunasms.commons.entities;

public class Admission {

    private final long id;
    private final String content;

    public Admission(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
