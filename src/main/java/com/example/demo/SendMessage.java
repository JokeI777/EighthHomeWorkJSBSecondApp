package com.example.demo;

public class SendMessage {
    private Integer id;
    private String state;
    private String time;
    private  String message;

    public SendMessage(Integer id, String state, String time, String message){
        this.id = id;
        this.state = state;
        this.message = message;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public Integer getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public String getTime() {
        return time;
    }
}
