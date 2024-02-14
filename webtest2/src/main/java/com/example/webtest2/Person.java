package com.example.webtest2;

public class Person {
    private String name;
    private int age;
    private int course;
    private String telegram;
    private String url;

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getCourse() {
        return this.course;
    }

    public String getTelegram() {
        return this.telegram;
    }

    public String getUrl() {
        return this.url;
    }
}
