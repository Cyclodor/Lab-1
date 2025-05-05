package com.example.studentapi.model;

public class Group {
    private String name;
    private int facultyId;
    private String facultyAbbrev;
    private String facultyName;
    private int course;
    private int id;

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getFacultyId() { return facultyId; }
    public void setFacultyId(int facultyId) { this.facultyId = facultyId; }

    public String getFacultyAbbrev() { return facultyAbbrev; }
    public void setFacultyAbbrev(String facultyAbbrev) { this.facultyAbbrev = facultyAbbrev; }

    public String getFacultyName() { return facultyName; }
    public void setFacultyName(String facultyName) { this.facultyName = facultyName; }

    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}