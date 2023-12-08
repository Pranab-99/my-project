package com.example.Entity;
import jakarta.persistence.*;
@Entity
public class UserEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String course;
    private String email;
    private String city;

    // Constructors, getters, and setters

    public UserEntity() {
        // Default constructor required by JPA
    }

    public UserEntity(String name, String course, String email, String city) {
        this.name = name;
        this.course = course;
        this.email = email;
        this.city = city;
    }

    // Getters and setters for all fields (including id)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    // toString method for debugging and logging

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}


