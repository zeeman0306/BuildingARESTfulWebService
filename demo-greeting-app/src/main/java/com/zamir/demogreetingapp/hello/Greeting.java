package com.zamir.demogreetingapp.hello;

public class Greeting {
    //Instance Variable
    private final long id;
    private final String content;

    //Constructor
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    //Getters
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }


}
