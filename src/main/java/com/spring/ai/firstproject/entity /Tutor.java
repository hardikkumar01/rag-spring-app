package com.spring.ai.firstproject.entity;

// Tut DTO
public class Tutor {
    private  String title;
    private  String content;
    private  String createdYear;

    public Tutor(String title, String content, String createdYear) {
        this.title = title;
        this.content = content;
        this.createdYear = createdYear;
    }
    public Tutor() {
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getCreatedYear() {
        return createdYear;
    }
    public void setCreatedYear(String createdYear) {
        this.createdYear = createdYear;
    }
  
}
