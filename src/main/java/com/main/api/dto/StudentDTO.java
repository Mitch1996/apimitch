package com.main.api.dto;

public class StudentDTO {

    private String id;
    private String firstName;
    private String password;
    private String lastName;
    private String email;
    private String ervaring;
    private Integer sterren;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getErvaring() {
        return ervaring;
    }

    public void setErvaring(String ervaring) {
        this.ervaring = ervaring;
    }

    public Integer getSterren() {
        return sterren;
    }

    public void setSterren(Integer sterren) {
        this.sterren = sterren;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}