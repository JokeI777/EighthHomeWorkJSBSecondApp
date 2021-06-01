package com.example.demo;

public class ReceivedMessage {
    private Integer id;
    private String name;
    private String phoneNumber;

    public ReceivedMessage(Integer id, String name, String phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
