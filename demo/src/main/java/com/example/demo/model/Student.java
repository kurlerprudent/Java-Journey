package com.example.demo.model;

import java.util.UUID;

public class Student {
    private String ID;
    private String name;
    private String programme;

    public Student() {
        this.ID = UUID.randomUUID().toString();
    }

    public Student(String name, String programme) {
        this.ID = UUID.randomUUID().toString();
        this.name = name;
        this.programme = programme;
    }

    public Student(String ID, String name, String programme) {
        this.ID = ID;
        this.name = name;
        this.programme = programme;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getProgramme() {
        return programme;
    }

    public void setID(String id) {
        if (ID == null) {
            ID = id;

        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgramme(String programme) {
        this.name = programme;
    }

}
