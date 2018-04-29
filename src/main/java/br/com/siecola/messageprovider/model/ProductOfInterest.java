package br.com.siecola.messageprovider.model;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;

public class ProductOfInterest {

    private long id;
    private int code;
    private float price;

    @NotNull
    @Email
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
