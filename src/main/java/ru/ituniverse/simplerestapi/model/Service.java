package ru.ituniverse.simplerestapi.model;

import java.io.Serializable;


public class Service implements Serializable{
    private static final long serialVersionUID = 3910931025428991653L;

    private String name;

    public Service() {}

    public Service(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
