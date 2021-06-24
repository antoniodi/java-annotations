package com.anthonydi.application.acl;

public class MovieDTO {

    private String title;
    private String year;
    private String gender;

    public MovieDTO( String title, String year, String gender ) {
        this.title = title;
        this.year = year;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
