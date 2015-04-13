package com.example.hkim142.map524lab6;

/**
 * Created by Henry on 2015-04-07.
 */
public class Friend {
    private int id;
    private String name;
    private String phoneNumber;
    private String email;

    public Friend() {
        id = 0;
        name = "";
        phoneNumber = "";
        email = "";
    }

    public Friend(int id, String name, String phoneNumber, String email) {
        this.setId(id);
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name;
    }
}

