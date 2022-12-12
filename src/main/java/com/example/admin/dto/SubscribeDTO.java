package com.example.admin.dto;

public class SubscribeDTO {
    private String email;
    private String indate;

    public SubscribeDTO(String email, String indate) {
        this.email = email;
        this.indate = indate;
    }

    public SubscribeDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }
}
