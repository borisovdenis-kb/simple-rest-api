package ru.ituniverse.simplerestapi.model;

import java.io.Serializable;


public class Service implements Serializable{
    private static final long serialVersionUID = 3910931025428991653L;

    private Long id;

    private String name;

    public Service() {}

    public Service(Long id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
