package ru.ituniverse.simplerestapi.model;

import java.io.Serializable;
import java.util.Set;


public class User implements Serializable {
    private static final long serialVersionUID = -6376834647869488865L;

    private String firstName;

    private String lastName;

    private String middleName;

    private Integer age;

    private Integer gender;

    private Set<Service> selectedServices;

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Set<Service> getSelectedServices() {
        return selectedServices;
    }

    public void setSelectedServices(Set<Service> selectedServices) {
        this.selectedServices = selectedServices;

    }
}
