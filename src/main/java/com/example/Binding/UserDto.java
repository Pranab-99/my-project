package com.example.Binding;

public class UserDto {

    private String name;
    private String course;
    private String email;
    private String city;

    // Constructors, getters, and setters

    public UserDto() {
        // Default constructor
    }

    public UserDto(String name, String course, String email, String city) {
        this.name = name;
        this.course = course;
        this.email = email;
        this.city = city;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
