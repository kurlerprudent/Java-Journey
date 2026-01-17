package com.example.demo.model;

import java.util.UUID;

public class Coffee {
    private String ID;
    private String name;

    public Coffee() {
        this.ID = UUID.randomUUID().toString();
    }

    public Coffee(String name) {
        this.ID = UUID.randomUUID().toString();
        this.name = name;
    }

    public Coffee(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        // Optional: prevent overriding id manually
        if (this.ID == null) {
            this.ID = id;
        }
    }

}
