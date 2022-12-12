package com.example.admin.dto;

public class BuyDTO {

    private String id;
    private String email;
    private String coinid;
    private String name;
    private int price;
    private int amount;
    private int total;

    public BuyDTO(String id, String email, String coinid, String name, int price, int amount, int total) {
        this.id = id;
        this.email = email;
        this.coinid = coinid;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.total = total;
    }

    public BuyDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCoinid() {
        return coinid;
    }

    public void setCoinid(String coinid) {
        this.coinid = coinid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
