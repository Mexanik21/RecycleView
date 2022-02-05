package com.example.exam.model;

public class Member {
    private int profile;
    private String title;

    public Member(int profile, String title) {
        this.profile = profile;
        this.title = title;
    }

    public Member() {
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
